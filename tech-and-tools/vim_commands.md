# <p align="center">**_Vim Text Editor_**</p> 
<br>
    
## **1. Vim Modes**
There are 2 modes 

    1. Insert mode (Press I)
    2. Command mode (Press Esc)
<br>

## **2. Quit From Terminal**

1. Without save

        :q   (If no change in file)
        :q!  (If change in file)

2. Quit with save    

        :wq

<br>

## 3. **Text Line Number**

1. Show number

        :set number
        
2. Turn off number
   
        :set nonumber
<br>

## 4. **Write Into Current State**

Where last edited (place)

    :w
<br>

## 5. **Undo & Redo**
1. Undo in cmd mode

        u
2. Redo in cmd mode

        Ctrl + r

## 6. **Delete (Cutting)**

1. Delete a line in command mode

        dd
2. Delete multiple line in cmd mode

        [number_of_line]dd
        example: 3dd
3. Delete a range of lines

        :[Start],[End]d
        example: :2,8d

        Specify the range using special characters:
        . (dot) - The current line. Exm 
        $ - The last line.
        % - All lines.

        Few examples:
        :.,$d - From the current line to the end of the file.
        :.,1d - From the current line to the beginning of the file.
        10,$d - From the 10th line to the end of the file.
4. Delete all lines

        %d


## 7. **Copy (Yanking)**

1. Normal way (First select the portion)

        Ctrl + Insert


## 8. **Paste (Putting)**

1. Normal way

        Shift + Insert

## 9. **Searching**

1. Search a text

        /[search_text]

        1. Press 'n' go to next match
        2. Press 'N' go to previous match

2. Search & Replace

        1. Replace one by one
                :%s/[search_text]/[replace_text]/gc

        2. Change 
                :%/[search_text]/[replace_text]/g

3. Search using line number

        :[line_number]   
        Example (:12)




