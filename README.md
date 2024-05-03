
## Problem Statement
You are tasked with developing a shape drawing application that allows users to draw various shapes using
different drawing tools. The application should support drawing circles and squares, and users should be able
to select between different drawing tools such as a pen or a brush.

## Requirements
1. Define a set of interfaces and classes to represent shapes and drawing tools in the application.

2. Implement the Shape interface to define methods for drawing shapes with different tools.

3. Implement the Tool interface to define methods for drawing circles and squares with different drawing tools.

4. Create concrete implementations of drawing tools, such as a Pen and a Brush, each capable of drawing circles and squares.

5. Ensure that the drawing operations use double dispatch to dynamically select the appropriate drawing method based on the type of shape and drawing tool.

6. Develop a Main class to demonstrate the functionality of the application. Instantiate shapes (circles and squares) and drawing tools (pen and brush) and use the drawWith() method to draw shapes with different tools.


## Constraints
• Ensure that the implementation follows the principles of abstraction and encapsulation.

• Use appropriate design patterns, such as double dispatch, to achieve flexibility and maintainability in the codebase.

• The application should be well-structured, modular, and easy to extend with additional shapes and drawing tools in the future.

## Note
Adjust the problem statement as per your specific requirements and constraints.
