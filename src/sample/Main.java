package sample;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Stack;

public class Main extends Application {
    private GridPane o = new GridPane();
    private BorderPane one= new BorderPane();
    private Button peek = new Button("peek");
    private Button pop = new Button("pop");
    private  Button push = new Button("Push");
    private Scene scene = new Scene(o,500,500);
    private TextField searchField = new TextField("search");



    @Override
    public void start(Stage primaryStage) throws Exception{

   primaryStage.setTitle("Track the hikers");

        o.add(push,0,1);
        o.add(pop,0,2);
        o.add(searchField,1,0);
        o.add(peek,2,0);
        Stack<Integer> stack = new Stack<Integer>();
        pop.setOnAction(e ->  stack_pop(stack));

        push.setOnAction(e ->  stack_push(stack));
        peek.setOnAction(e ->  stack_search(stack, 9));

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    // Pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack)
    {
        for(int i = 0; i < 5; i++)
        {
            stack.push(i);
        }
    }

    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("Pop Operation:");

        for(int i = 0; i < 1; i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    // Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    // Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);

        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }


}
