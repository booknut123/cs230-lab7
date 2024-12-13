[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/XBSS56tj)
# CS230X-lab7-F24
# Queue Implementations

This is a partner lab, [please find your partner for lab 7 here](https://docs.google.com/spreadsheets/d/15ctGjhdPOmH5WX3ggrdF_RKCYon0m3N4LUeT1m9Dz6Y/edit?gid=0#gid=0).

In this lab you will work on implementing Queues in two different ways, using arrays and linked lists. 

### Goals:
Gaining experience with:
- [ ] Queues
- [ ] Interface implementations
- [ ] Linked Lists (as per the javafoundations implementation)

### Task 1: ArrayQueue Implementation
In class, we have started working on the ArrayQueue implementation. Start by taking a look at the slides and the class notes you took. 
Now look at the starting code for this lab. It should contain a **javafoundations** folder that you can use in this task (and the next).  

Implement all the methods in **ArrayQueue.java** (as per the slides in class).  

### Task 2: LinkedQueue Implementation
Like the other Queue implementation seen in class, **LinkedQueue** will also be part of the **javafoundations** package.

Now you are ready to start your coding in the **LinkedQueue.java** file.
Some questions to consider (with your partner):
* Where should the **LinkedQueue.java** file be saved?
* What interface should the class implement?
* How can you be sure that you are not missing any method that needs implementation? 

Some recommendations:
* Start with declaring instance variables, then define the constructor.
* Test every method right after you write it. 
* Re-read the LinearNode.java class carefully, to remind yourself what the building blocks of LinkedLists look like and their functionality.

### Task 3: Queues with random dequeues
We want to define a new, special kind of Queue called `RandomQueue`. It is everything a Queue is, and more. It has the ability to remove elements from a random position in the queue (this method is called `dequeueRandom()`). 

Before you start coding, you have some decisions to make. Below are some questions to help you decide some (but not all) of these decisions. Make sure to answer them with your partner (and even include the answers in the javadoc for your new class) before writing code. 

If the class is “everything a Queue is, and more”, what does that say about the relationship between the new class you’re writing and the existing classes? Think about all the relationships we’ve seen so far (‘uses’, ‘extends’, ‘implements’). Each relationship (and word) has implications on what instance variables to use and what methods need defining. 

- Depending on the decision made for the previous question, what package should this new class be in?
- What method is `dequeueRandom()` most similar to? Should `dequeueRandom()` take any parameters? Be fruitful? Throw exceptions? 
- How should you test this new class? Which methods require testing, given your previous choices? How many testing cases do you need?

### Task 4: Testing
Create a new class, named **QueueDriver.java** for testing your Queue implementations. It should only have a <code>main()</code> method to test your implementation.
Test all three of your implementations thoroughly in this class.

## SAVING YOUR WORK ON GITHUB
As we have discussed in class, it is important to work on labs and assignments regularly and save frequently. You should test your work incrementally, which will require you to save your file before compiling/running it. In addition to saving your work on your local machine, you should also frequently push your work to this Github repository. You can refer to Lab0 and the [Git and Github tutorial](https://github.com/CS230X-F24/github-starter-course) for a refresher on using these tools. 

## SUBMITTING TO GRADESCOPE
Turn in your work submitting files ArrayQueue.java, LinkedQueue.java, RandomQueue.java and your QueueDriver.java to your Gradescope account for Lab7. You will receive full credit for this lab if you submit a reasonable attempt at completing the lab by the deadline. [Click here for Gradescope instructions.](https://docs.google.com/document/d/1zGAJrbdAhfPZVlyDP9N3MmdKXWvNo7rQqehKNM5Q0_M/edit) 

## AUTOGRADER
When you submit your lab to Gradecope, you will immediately see some feedback through the autograder. You are welcome to resubmit as many times as you wish until the deadline. The autograder will check for accuracy, style, and documentation. Make sure there are no remaining `TODO` comments in your submission code. Click here for 230X instructions on: [testing your code](https://docs.google.com/document/d/19cKOyolT8UtSfMNrVw8MGgVWS-lYgHpBs8g2Cf_8Vvc/edit#heading=h.rt39ohf1jp6s), [styling your code](https://docs.google.com/document/d/14uwj9HAjNKfFBm0ZjUpWR7jdqKSj13rudIEJaG74mPk/edit), and [documenting your code](https://docs.google.com/document/d/15uqs_NH8y2sAuLLpiZuSxlI0UsL6a8CHuWY_qcvF4B4/edit). 

## LAB SOLUTIONS
Lab solutions will be added to this repository after the lab deadline. 
