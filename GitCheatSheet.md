gi# Git Cheat Sheet

## Connect to Forked Branch

```
git remote add upstream https://github.com/CodeDifferently-RRW21-FT/PairCodingTDD01.git

git fetch upstream

git rebase upstream/main
```

* Check the status of your repo

```
git status
```

* Add your changes to the current branch

```
git add .
```

* Commit your changes to the current branch

```
git commit -m "Add a message about the commit"
```

* Push your changes to the a branch called `main`

```
git push origin main
```

* Pull changes from a branch called `main`

```
git pull origin main
```
