tfgds
new update
gfg

Git Reset:
--------------
By mistake if you add the file from working area to statgging area then if you want to back the file from sta. area to working area

> git reset

. -> current directory
git add .
git add *
git add fn1 fn2 fn3
git add *.java
git add *.share
git add emp*

everything ok

Git Revert command:
-----------------------
> git revert <commitid> 

# to check the alias name of mapped remote repository
-----------------------------------------------------
> git remote -v

# To remove the current alias name:
------------------------------------------
> git remote remove <aliasname>

# To rename the alias of remote repo:
----------------------------------------

> git remote rename <old alias> <new alias>

# to remove the file from the working area:
---------------------------------------------
> git clean -n

here n -> review the filename

----------------------------------------------------
IDE
----------
elipse
myeclips
netbean
nodejs -> node_module

.password - > if you don't want to upload any unwanted or important file on remote repo.
In that case we will use .gitignore file


# Git Branching:
------------------
to check the no. of branch avaible
> git branch
to create the new branch
> git branch <branch name>

To switch to other branch

> git checkout <branch name>

now developer code avaible here

---------------------------------------------
hi i am developing code in dev branch to deploy new functionality.
----------------------------------------------------------------------
upading the code in master branch 
----------------------------------------
------------------------------------------------------
upding code in dev branch
-------------------------------------

#### Employee Portal ######

Manager asked me to create emplyee portal 
hdfjdfh
dfdshkfhsdjkfhds
jdhfksjdhfkjshd
jhfkjsdhfkjsdhf
sjfwkdhfjdshfj
djfhsdkjfhdskjfh
sdjfhshgfhj
==============================

Topic: Git Tag:
----------------
It is immutable. 
branch: during development
tag : after production release.

flipkartv1.0.0
branch: we can able to modify 
tag: once you created, can;t modified.

Q: on which branch usually we will create the tag?
Answer: master
 
1. To create the Tag:
------------------------
> git tag <tagname>

2. To Push the tag:-
----------------------------

git push fk tag <tagname>

3. if you have multiple tags and you want to push in one short to remote repo:
 > git push <alias> --tags

4. To delete the tag
----------------------
git tag -d <tagname>

----------------------------------------------
Git Stash:
---------------------------
thadjkhewflwefewfkjewhf
sfjdfhkjhfjejwfkegfehfgefhjkhdfgdfhdhfjd
