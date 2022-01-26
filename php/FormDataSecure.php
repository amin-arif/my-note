<?php

$name = $email = "";
$nameErr = $emailErr = "";

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    if (empty($_POST['name'])) {
        $nameErr = "Name Required!";
    } else {
        $name = validateData($_POST['name']);
    }

    if (empty($_POST['email'])) {
        $emailErr = "Email Required!";
    } else {
        $email = validateData($_POST['email']);
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
            <span>Email: </span>
            <input type="email" name="email" value="<?php echo $email; ?>"> <br>
            <span style="color: red;"><?php echo $emailErr; ?></span>
        </div>
        <input type="submit" name="submit">
    </form>
</body>
</html>