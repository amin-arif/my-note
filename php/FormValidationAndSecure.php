<?php

$name = $gender = $email = $url = $password = "";
$nameErr = $genderErr = $emailErr = $urlErr = $passwordErr = "";

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    if (empty($_POST['name'])) {
        $nameErr = "Name Required!";
    } else {
        $name = validateData($_POST['name']);

        if (!preg_match("/^[a-zA-Z-' ]*$/", $name)) {
            $nameErr = "Only letters and whitespace allowed";
        }
    }

    if (empty($_POST['gender'])) {
        $genderErr = "Gender Required!";
    } else {
        $gender = validateData($_POST['gender']);
    }

    if (empty($_POST['email'])) {
        $emailErr = "Email Required!";
    } else {
        $email = validateData($_POST['email']);

        if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
            $emailErr = "Invalid email format";
        }
    }

    if (empty($_POST['url'])) {
        $urlErr = "URL Required!";
    } else {
        $url = validateData($_POST['url']);

        if (!preg_match("/\b(?:(?:https?|ftp):\/\/|www\.)[-a-z0-9+&@#\/%?=~_|!:,.;]*[-a-z0-9+&@#\/%=~_|]/i", $url)) {
            $urlErr = "Invalid URL!";
        }
    }

    if (empty($_POST['password'])) {
        $passwordErr = "Password Required!";
    } else {
        $password = validateData($_POST['password']);
    }
}

//======= This method is used for secure form =======\\
function validateData($data) 
{
    $data = trim($data);
    $data = stripslashes($data);
    $data = htmlspecialchars($data);

    return $data;
}

?>



<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form</title>
</head>
<body>
    <h1>Form Validation</h1>

    <form action="" method="post">
        <div>
            <span>Name: </span>
            <input type="text" name="name" value="<?php echo $name; ?>"> <br>
            <span style="color: red;"><?php echo $nameErr; ?></span>
        </div>
        <div>
            <fieldset>
                <legend>Gender Section</legend>
                <label for="male"><input type="radio" value="male" name="gender" id="male" <?php if(isset($gender) && $gender == "male") {echo "checked";} ?> >Male</label>
                <label for="female"><input type="radio" value="female" name="gender" id="female" <?php if(isset($gender) && $gender == "female") {echo "checked";} ?>>Female</label> <br>
                <span style="color: red;"><?php echo $genderErr; ?></span>
            </fieldset>
        </div>
        <div>
            <span>Email: </span>
            <input type="text" name="email" value="<?php echo $email; ?>"> <br>
            <span style="color: red;"><?php echo $emailErr; ?></span>
        </div>
        <div>
            <span>Url: </span>
            <input type="text" name="url" value="<?php echo $url; ?>"> <br>
            <span style="color: red;"><?php echo $urlErr; ?></span>
        </div>
        <div>
            <span>Password: </span>
            <input type="password" name="password" value="<?php echo $password; ?>"> <br>
            <span style="color: red;"><?php echo $passwordErr; ?></span>
        </div>
        <input type="submit" name="submit">
    </form>
</body>
</html>