package org.example

class Utilities implements Serializable {
    def steps

    Utilities(steps){
        this.steps = steps
    }

    def printTime(){
        def currentTime = new Date()
        steps.echo "current time :${currentTime}"
    }
}