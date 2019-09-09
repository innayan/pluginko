import jetbrains.buildServer.configs.kotlin.v2018_2.*

/*
The settings script is an entry point for defining a TeamCity
project shierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2019.1"

project {

    subProject(ArchievdSubproj)
}


object ArchievdSubproj : Project({
    name = "archived subproj"

    buildType(ArchievdSubproj_ArchivedConifig)
    buildType(ArchievdSubproj_ArchievdConifg)
    buildType(ArchievdSubproj_ArchivedConfig1)
})

object ArchievdSubproj_ArchievdConifg : BuildType({
    name = "archievd conifg"
})

object ArchievdSubproj_ArchivedConfig1 : BuildType({
    name = "archived config1"
})

object ArchievdSubproj_ArchivedConifig : BuildType({
    name = "archived config"
})
