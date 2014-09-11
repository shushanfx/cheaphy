import org.gradle.api.*
import org.gradle.api.tasks.*

class TestTask extends DefaultTask {
    @Optional
    String message = 'I am davenkin'

    @TaskAction
    def hello(){
        println "hello world $message"
    }
}