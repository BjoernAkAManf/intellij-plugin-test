package com.github.bjoernakamanf.intellijplugintest.services

import com.github.bjoernakamanf.intellijplugintest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
