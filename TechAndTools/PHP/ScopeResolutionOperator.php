<?php
// Scope Resolution Operatior --> ::
// keyword --> self, parent, const, static

class Template 
{
    const CONST_VALUE = '3.1416';
    static $staticValue= 'Bangladesh';
    
    public function show()
    {
        echo self::CONST_VALUE . "\n";
        echo self::$staticValue . "\n";
    }
    
}

class ChildTemplate extends Template
{
    private const DOB = '16-Dec-1971';
    
    public function showMe()
    {
        echo parent::CONST_VALUE . "\n";
        echo parent::$staticValue . "\n";
        echo self::DOB . "\n";
    }
}

// Parent class
echo "### Parent ###\n";

$obj = new Template();
$obj->show();

// Access constant and static variable outside class
echo "\n### Outside Class ###\n";

echo Template::CONST_VALUE;
echo Template::$staticValue . "\n";

// Access constant and static variable from child class
echo "\n### Child ###\n";

$childObj = new ChildTemplate();
$childObj->showMe();

// Parent method access using child obj
echo "\n### Miscellaneous ###\n";

echo $childObj->show();

?>
