import javafx.application.Application
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class HelloWorld : Application() {

    override fun start(primaryStage: Stage) {

        primaryStage.title = "Hello World"

        val button = Button()

        button.text = "Push me, I am a button!"

        button.onAction =

                object : EventHandler<ActionEvent> {

                    override fun handle(event: ActionEvent) {

                        println("Hello World")

                    }

                }

        val root = StackPane()

        root.children.add(button)

        primaryStage.scene = Scene(root, 300.0, 250.0)

        primaryStage.show()

    }

}
