package com.yy.domain

import groovy.transform.PackageScope

/**
 * Created by yangyang on 16/7/22.
 */
class GroovyMain {
    @PackageScope
    String name = "asas"
    String nickname;

    static void main(args) {
        GroovyMain groovyMain = new GroovyMain()
        print groovyMain.name
        print("\n")
        println "hello world"
    }
}
