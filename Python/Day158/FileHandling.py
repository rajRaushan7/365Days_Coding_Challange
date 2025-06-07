from pathlib import Path
import os

def readFile():
    path = Path('')  # '' --> means path of current directory
    items = list(path.rglob('*'))
    for i, item in enumerate(items): 
        print(f"{i+1}.  {item}")
    

def handleCreate():     #Create
    readFile()
    try:
        name = input("Please tell your file name: ")
        p = Path(name)
        if not p.exists():
            with open(p, "w") as f:
                data = input("What you want to write in this file: ")
                f.write(data)
            print("File created successfully!") 
        else:
            print("This file already exists!")

    except Exception as err:
        print(f"Some error occured as: {err}")


def handleRead():       #Read
    readFile()
    fileName = input("Enter file name which you want to read: ")
    try:
        p = Path(fileName)
        if p.exists() and p.is_file():
            with open(p) as f: 
                data = f.read()
                print(data)
            
            print("File Readed Successfully!")
    except Exception as err:
        print(f"Some error occured as: {err}")



def handleUpdate():     #Update
    readFile()
    fileName = input("Enter file name which you want to update: ")
    try:
        p = Path(fileName)
        if p.exists() and p.is_file():
            print("Enter 1 to update file name: ")
            print("Enter 2 to append something to the file: ")
            print("Enter 3 to overwrite the file: ")

            n = int(input("Enter your response: "))
            if n == 1:
                name2 = input("Enter new name for the choosen file: ")
                p2 = Path(name2)
                p.rename(p2)
                print("File name updated Successfully!")
                readFile()
            
            elif n == 2: 
                with open(p, 'a') as f:
                    data = input("Enter what you want to append to your file: ")
                    f.write(" " + data)
                print("Data appended successfully!")

            elif n == 3: 
                with open(p, 'w') as f:
                    data = input("Enter the data which you want to overwrite to the file: ")
                    f.write(data)
                print("New data added successfully!")
            
            else: 
                print("Incorrect response, Please try again!")

        else: 
            print("A file with this name doesn't exists, Please check your response and try again!")

    except Exception as err:
        print(f"Some error occured as : {err}")


def handleDeletion():       #Delete
    readFile()
    fileName = input("Enter file name which you wan't to delete: ")
    try:
        p = Path(fileName)
        if p.exists() and p.is_file():
            os.remove(p)
            readFile()
            print("File deleted successfully!")
        else:
            print("No such file exists, Please check your response and try again!")
    except Exception as err:
        print(f"Some error occured as: {err}")


print("Press 1 for Creating a file.")
print("Press 2 for Reading a file.")
print("Press 3 for Updating a file.")
print("Press 4 for Deleting a file.")

n = int(input("Enter a value: "))



if n == 1: 
    handleCreate()

elif n == 2:
    handleRead()

elif n == 3: 
    handleUpdate()

elif n == 4:
    handleDeletion()

else:
    print("Incorrect Response, Please try again!")