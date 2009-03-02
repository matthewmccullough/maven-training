Sample 11 is a submodule.  After cloning the top level project, type:
git submodule init
git submodule update

This will fetch the indicated Hash-referenced-version source for the submodule sample 11.

Then to checkout the subversion variant of sample11, type:
svn co http://ambientideas.unfuddle.com/svn/ambientideas_sample11-svnscm/trunk sample11-svnscm.svn