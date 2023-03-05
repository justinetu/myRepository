This is a user friendly banking application which allows a user to desposit and withdraw money from an account, create a new account, or check how much money is in their total balance. 

https://meet.google.com/vuq-kefu-yzw

Observations:

-We create an object called o_1 using the MyClass default constructor
-We then create an object called o_2 using the user defined constructor
-We also create an object called o_3 and using the copy constructor
-Next, we create an object called o_4 using the copy constructor.
-After o_4 is created, o_4 uses copy assignment to make this object equal to o_1 so o_4’s data is overwritten.
-Following the copy assignment, we construct a new object called o_5 using the customer constructor then we use the move assignment operator which moves the contents of object o_1 to o_5.
-Next, o_1 uses the copy assignment operator and the move constructor to take over o_3’s data so whatever data that belonged to o_3 now belongs to o_1.
-We construct a new object called o_6 and assign it to  a function that constructs a MyClass object using the custom constructor and returns it.
-Object o_7 is then created and uses copy assignment  to assign it to a function that constructs an object of type MyClass using the custom constructor and returns the contents of the object so that o_7 now contains the data

Vector:

-A vector of objects of type MyClass is created.
-Next, v_1 gets initialized to v_1[0] we use the emplace_back method on v_1 which constructs a new object and gives it the rvalue.
-Then we construct a new object using the custom constructor and append it to v_1 in the next line.
-Next, we construct a new object of type MyClass and initialize it with v_1[1] and put it at the end of vector v_1 using emplace_back.
-Next, we construct a new vector v_2 of MyClass objects and use copy assignment so v_2 equals v_1.
-In the next line, we construct a new vector called v_3 and assign it to the rvalues of v_1 using the move constructor.

Pointers:

-A pointer up_1 is created and is made unique. It constructs an object of type MyClass then initializes it with u_1 using the custom constructor.
-A shared pointer sp_1 is created. It constructs a MyClass object and initializes it with s_1.
-Another unique pointer up_2 is created then, in the next line, we strip the data from up_1 and it’s given to up_3 which is a unique pointer.
-Another shared pointer is created called sp_2. Following the creation of sp_2, we use copy assignment to assign sp_2 to sp_1.
