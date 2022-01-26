<?php

//------------ Regular Expression ------------------\\

// Resource: https://www.w3schools.com/php/php_regex.asp

// A regular expression is a sequence of characters that forms a search pattern.
// A regular expression can be a single character, or a more complicated pattern.
// Regular expressions can be used to perform all types of text search and text replace operations.


// The delimiter can be any character that is not a letter, number, backslash or space.
// The most common delimiter is the forward slash (/)


class RegularExpression
{
    public function searchByText($pattern, $str)
    {
        return preg_match($pattern, $str); // Returns 1 if the pattern was found in the string and 0 if not
    }

    public function searchByTextWithCount($pattern, $str)
    {
        return preg_match_all($pattern, $str); // Returns the number of times the pattern was found in the string, which may also be 0
    }

    public function replaceWithSearchText($pattern, $replaceText, $str)
    {
        return preg_replace($pattern, $replaceText, $str); // Returns a new string where matched patterns have been replaced with another string. If not matched return existing string.
    }
}


$re = new RegularExpression();

$str1 = "I am Bangladeshi.";
$pattern1 = "/bangladeshi/i";  // search = bangladeshi; case-insensitive = i; delimeter = / 

echo $re->searchByText($pattern1, $str1) . "\n";


$str2 = "Bangladesh is a beautiful Country. It is a small country.";
$pattern2 = "/is|eau/"; // case-sensitive search; | = or type matching

echo "Total found: " . $re->searchByTextWithCount($pattern2, $str2) . "\n"; 


$str3 = "Hey Kanon";
$pattern3 = "/kanon/i";
$replaceText = "Arif";

echo $re->replaceWithSearchText($pattern3, $replaceText, $str3);