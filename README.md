This is a user friendly banking application which allows a user to desposit and withdraw money from an account, create a new account, or check how much money is in their total balance. 

https://meet.google.com/vuq-kefu-yzw

MyClass o_1;
  default ctor (1,unnamed)
MyClass o_2("o_2");
  custom ctor (2,o_2)
MyClass o_3 = o_2;
  copy ctor (3,copy of (2,o_2))
MyClass o_4("o_4");
  custom ctor (4,o_4)
o_4 = o_1;
  copy assign (4,o_4) from (1,unnamed)
MyClass o_5(move(o_1));
  move ctor (5,moved from unnamed)
o_1 = move(o_3);
  move assign (1,stolen) from (3,copy of (2,o_2))
MyClass o_6 = make_new_object_good();
  custom ctor (6,x)
MyClass o_7 = make_new_object_bad();
  custom ctor (7,y)
  move ctor (8,moved from y)
  dtor (7,stolen)
open brace (vectors)
vector<MyClass> v_1;
v_1.emplace_back("v_1[0]");
  custom ctor (9,v_1[0])
v_1.push_back(MyClass("v_1[1]"));
  custom ctor (10,v_1[1])
  move ctor (11,moved from v_1[1])
  move ctor (12,moved from v_1[0])
  dtor (9,stolen)
  dtor (10,stolen)
v_1.emplace_back(MyClass("v_1[2]"));
  custom ctor (13,v_1[2])
  move ctor (14,moved from v_1[2])
  move ctor (15,moved from moved from v_1[0])
  dtor (12,stolen)
  move ctor (16,moved from moved from v_1[1])
  dtor (11,stolen)
  dtor (13,stolen)
vector<MyClass> v_2 = v_1;
  copy ctor (17,copy of (15,moved from moved from v_1[0]))
  copy ctor (18,copy of (16,moved from moved from v_1[1]))
  copy ctor (19,copy of (14,moved from v_1[2]))
vector<MyClass> v_3 = move(v_1);
closing brace (vectors)
  dtor (15,moved from moved from v_1[0])
  dtor (16,moved from moved from v_1[1])
  dtor (14,moved from v_1[2])
  dtor (17,copy of (15,moved from moved from v_1[0]))
  dtor (18,copy of (16,moved from moved from v_1[1]))
  dtor (19,copy of (14,moved from v_1[2]))
opening brace (pointers)
auto up_1 = make_unique<MyClass>("u_1");
  custom ctor (20,u_1)
auto sp_1 = make_shared<MyClass>("s_1");
  custom ctor (21,s_1)
opening brace (inner pointers)
auto up_2 = make_unique<MyClass>("u_2");
  custom ctor (22,u_2)
auto up_3 = move(up_1);
auto sp_2 = make_shared<MyClass>("s_2");
  custom ctor (23,s_2)
sp_1 = sp_2;
  dtor (21,s_1)
closing brace (inner pointers)
  dtor (20,u_1)
  dtor (22,u_2)
closing brace (pointers)
  dtor (23,s_2)
closing brace (main)
  dtor (8,moved from y)
  dtor (6,x)
  dtor (5,moved from unnamed)
  dtor (4,=(1,unnamed))
  dtor (3,stolen)
  dtor (2,o_2)
  dtor (1,moved from copy of (2,o_2))
