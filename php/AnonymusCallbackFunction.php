<?php

//===== PHP Anonymus Function =====\
// Anonymous functions, also known as closures, allow the creation of functions which have no specified name.

echo "Anonymus Function \n";

$fruits = ["Mango", "Apple", "Banana"];

$anonymus = array_map(
    function($item) {return strlen($item);},
    $fruits
);

print_r($anonymus);


//===== PHP Callback Function =====\
// Any existing function can be used as a callback function. To use a function as a callback function, pass a string containing the name of the function as the argument of another function.

echo "PHP Callback Function \n";

function countStr($item)
{
    return strlen($item);
}

$animal = ["Cow", "Camel", "Goat", "Sheep"];

$callback = array_map("countStr", $animal);

print_r($callback);


