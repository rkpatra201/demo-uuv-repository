package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Hello World again" );
    }
}

/**
 * RabindraPatra@D3753SN2 MINGW64 ~/Documents/root/uuv/sept-2020/code/core/demo-uuv-repository
 * $ git init
 * Initialized empty Git repository in C:/Users/rabindrapatra/Documents/root/uuv/sept-2020/code/core/demo-uuv-repository/.git/
 *
 * RabindraPatra@D3753SN2 MINGW64 ~/Documents/root/uuv/sept-2020/code/core/demo-uuv-repository (master)
 * $ ls -a
 * ./  ../  .git/  .idea/  demo-uuv-repository.iml  pom.xml  src/
 *
 * RabindraPatra@D3753SN2 MINGW64 ~/Documents/root/uuv/sept-2020/code/core/demo-uuv-repository (master)
 * $ git add src/ pom.xml
 *
 * RabindraPatra@D3753SN2 MINGW64 ~/Documents/root/uuv/sept-2020/code/core/demo-uuv-repository (master)
 * $ git status
 * On branch master
 *
 * No commits yet
 *
 * Changes to be committed:
 *   (use "git rm --cached <file>..." to unstage)
 *         new file:   pom.xml
 *         new file:   src/main/java/org/example/App.java
 *         new file:   src/test/java/org/example/AppTest.java
 *
 * Untracked files:
 *   (use "git add <file>..." to include in what will be committed)
 *         .idea/
 *         demo-uuv-repository.iml
 *
 *
 * RabindraPatra@D3753SN2 MINGW64 ~/Documents/root/uuv/sept-2020/code/core/demo-uuv-repository (master)
 * $ git commit -m "my first commit"
 * [master (root-commit) cb7756e] my first commit
 *  Committer: Rabindra Patra <RabindraPatra@corp.fairisaac.com>
 * Your name and email address were configured automatically based
 * on your username and hostname. Please check that they are accurate.
 * You can suppress this message by setting them explicitly. Run the
 * following command and follow the instructions in your editor to edit
 * your configuration file:
 *
 *     git config --global --edit
 *
 * After doing this, you may fix the identity used for this commit with:
 *
 *     git commit --amend --reset-author
 *
 *  3 files changed, 108 insertions(+)
 *  create mode 100644 pom.xml
 *  create mode 100644 src/main/java/org/example/App.java
 *  create mode 100644 src/test/java/org/example/AppTest.java
 *
 * RabindraPatra@D3753SN2 MINGW64 ~/Documents/root/uuv/sept-2020/code/core/demo-uuv-repository (master)
 * $ git status
 * On branch master
 * Untracked files:
 *   (use "git add <file>..." to include in what will be committed)
 *         .idea/
 *         demo-uuv-repository.iml
 *
 * nothing added to commit but untracked files present (use "git add" to track)
 *
 * RabindraPatra@D3753SN2 MINGW64 ~/Documents/root/uuv/sept-2020/code/core/demo-uuv-repository (master)
 * $ git remote add origin git@github.com:rkpatra201/demo-uuv-repository.git
 *
 * RabindraPatra@D3753SN2 MINGW64 ~/Documents/root/uuv/sept-2020/code/core/demo-uuv-repository (master)
 * $ git push origin master
 * Enumerating objects: 14, done.
 * Counting objects: 100% (14/14), done.
 * Delta compression using up to 8 threads
 * Compressing objects: 100% (6/6), done.
 * Writing objects: 100% (14/14), 1.69 KiB | 216.00 KiB/s, done.
 * Total 14 (delta 0), reused 0 (delta 0), pack-reused 0
 * To github.com:rkpatra201/demo-uuv-repository.git
 *  * [new branch]      master -> master
 *
 * RabindraPatra@D3753SN2 MINGW64 ~/Documents/root/uuv/sept-2020/code/core/demo-uuv-repository (master)
 * $ git status
 * On branch master
 * Changes not staged for commit:
 *   (use "git add <file>..." to update what will be committed)
 *   (use "git restore <file>..." to discard changes in working directory)
 *         modified:   src/main/java/org/example/App.java
 *
 * Untracked files:
 *   (use "git add <file>..." to include in what will be committed)
 *         .idea/
 *         demo-uuv-repository.iml
 *
 * no changes added to commit (use "git add" and/or "git commit -a")
 *
 * RabindraPatra@D3753SN2 MINGW64 ~/Documents/root/uuv/sept-2020/code/core/demo-uuv-repository (master)
 * $ git add src/
 *
 * RabindraPatra@D3753SN2 MINGW64 ~/Documents/root/uuv/sept-2020/code/core/demo-uuv-repository (master)
 * $ git status
 * On branch master
 * Changes to be committed:
 *   (use "git restore --staged <file>..." to unstage)
 *         modified:   src/main/java/org/example/App.java
 *
 * Untracked files:
 *   (use "git add <file>..." to include in what will be committed)
 *         .idea/
 *         demo-uuv-repository.iml
 *
 *
 * RabindraPatra@D3753SN2 MINGW64 ~/Documents/root/uuv/sept-2020/code/core/demo-uuv-repository (master)
 * $ git commit -m "one more line added"
 * [master 53fae42] one more line added
 *  Committer: Rabindra Patra <RabindraPatra@corp.fairisaac.com>
 * Your name and email address were configured automatically based
 * on your username and hostname. Please check that they are accurate.
 * You can suppress this message by setting them explicitly. Run the
 * following command and follow the instructions in your editor to edit
 * your configuration file:
 *
 *     git config --global --edit
 *
 * After doing this, you may fix the identity used for this commit with:
 *
 *     git commit --amend --reset-author
 *
 *  1 file changed, 1 insertion(+)
 *
 * RabindraPatra@D3753SN2 MINGW64 ~/Documents/root/uuv/sept-2020/code/core/demo-uuv-repository (master)
 * $ git status
 * On branch master
 * Untracked files:
 *   (use "git add <file>..." to include in what will be committed)
 *         .idea/
 *         demo-uuv-repository.iml
 *
 * nothing added to commit but untracked files present (use "git add" to track)
 *
 * RabindraPatra@D3753SN2 MINGW64 ~/Documents/root/uuv/sept-2020/code/core/demo-uuv-repository (master)
 * $ git push origin master
 * Enumerating objects: 15, done.
 * Counting objects: 100% (15/15), done.
 * Delta compression using up to 8 threads
 * Compressing objects: 100% (4/4), done.
 * Writing objects: 100% (8/8), 567 bytes | 141.00 KiB/s, done.
 * Total 8 (delta 1), reused 0 (delta 0), pack-reused 0
 * remote: Resolving deltas: 100% (1/1), completed with 1 local object.
 * To github.com:rkpatra201/demo-uuv-repository.git
 *    cb7756e..53fae42  master -> master
 *
 * RabindraPatra@D3753SN2 MINGW64 ~/Documents/root/uuv/sept-2020/code/core/demo-uuv-repository (master)
 * $ git log -10 --oneline
 * 53fae42 (HEAD -> master, origin/master) one more line added
 * cb7756e my first commit
 *
 * RabindraPatra@D3753SN2 MINGW64 ~/Documents/root/uuv/sept-2020/code/core/demo-uuv-repository (master)
 */
