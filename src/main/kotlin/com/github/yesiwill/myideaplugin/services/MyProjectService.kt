package com.github.yesiwill.myideaplugin.services

import com.intellij.openapi.project.Project
import com.github.yesiwill.myideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
