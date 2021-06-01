# Restaurant Manager

Your task is to model a Restaurant. In a Restaurant different kinds of people can exist at the same time: Chefs, 
Waiters and Guests.

    • All people who are inside a Restaurant have a name and can be identified uniquely by an ID number.
All of them can interact with each other , but a bit differently:

    • Chefs can interact only with Waiters – a Chef takes all Orders available at a Waiter.
    • Waiters can interact with Guests – a Waiter takes a single Order from a Guest and stores it.
    • Guests can only interact with ither Guests – when a Guest interacts with another Guest they switch their 
      Orders(if Guest A’s order is X and Guest B’s order is Y then after interact Guest A’s order will be Y 
      and vice versa).
    • Don’t allow other interactions(Chefs can’t interact with Guests) – when this happens make sure this doesn't go 
      unnoticed!
    • Guests have a preference -  they always order the same thing. E.g. when a Guests interact with a Waiter they 
      always will order the same thing, no matter what.
Next: 

    • From now on Waiters should keep track of who ordered what(every Guest can order one thing).
    • Chefs when taking orders from the Waiters must keep track of which order will be made for which Guest.
If all of these goes well, then:

    • Chefs can cook the orders they’ve received from Waiters.
    • Before interacting with a Waiter a Chef will cook whatever order sit received from Waiters earlier.
    • When Chefs interacts with a Waiter it gives finished orders back to the Waiters to serve it to the Guest.
    • Because of this Waiters will now keep track of finished orders – when they interact with a Guest from now on…
