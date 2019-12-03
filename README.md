# lowering-generic-upperbound

## Basic type hierarchy
* TOP - the top class
   * Annotation - a subtype of TOP
      * Token - a subtype of Annotation

The Framework interface and impl:
* Framework_top
* Framework_top_impl

(Ignore for now the Framework_annotation and Framework_annotation_impl:
These are experiments)

The Framework takes a generic arg: T extends TOP.

The Demo class shows some code instantiating instances of the framework.

There are 2 "setup" methods in Demo; one (with the class argument) manages to pass along **at 
compile time** the type of the class argument, as a generic arg.

* You can see an instance of this being passed along at compile time in the first
statement in the run() method. 

The other setup method (taking 0 args) has no specification of the generic type other than its upper bound.

* You can see in the 2nd statement of the run() method, the compile time 
only knows the upper bound of TOP, so a cast is needed (the 3rd statement), or
you can pass in the generic upper bound (the 4th statement) which also works.

What I'd like to find is some what to change (in Framework_top) the definition of build_annotation_U to specify
that the returned value is not <U extends T> but rather <U extends T extends Annotation>,
essentially lowering the upper bound by default from TOP to Annotation, but also keeping any type that is passed in
at compile time via lines in Demo like the 1st statement or the 4th statement in run().

I know that syntax (U extends T extends Annotation> is not legal in Java, and was wondering if there's another way to do this.

 

      
