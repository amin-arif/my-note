<?php

// @ToDo: It is not complete and tasted

// Delete a directory with it's all subdirectories and files

$path = "delete_dir";
$deleteDirectory = null;

function deleteDirectories($path, $deleteDirectory) 
{
    $resource = opendir($path);

    while (($item = readdir($resource)) !== false) {
        if ($item !== "." && $item !== "..") {
            if (is_dir($path . "/" . $item)) {
                $deleteDirectory($path . "/" . $item);
            } else {
                unlink($path . "/" . $item);
            }
        }
    }
    
    closedir($resource);
    rmdir($path);
};

$deleteDirectory("path/to/directoy");


