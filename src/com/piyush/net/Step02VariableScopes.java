package com.piyush.net;

public class Step02VariableScopes {

    static String platform = "YouTube";         // 1. STATIC: Platform is YouTube (The platform name doesn't change per video)
    String videoTitle;                          // 2. INSTANCE: Video - (Unique to each video, every video has its own title and views)

    public void youtubeViews(int newViews) {
        int views = 100;
        int updatedTotal = views + newViews;   // 3. LOCAL: Views per video - Temporary variable used for a quick calculation

        views = updatedTotal;
        System.out.println("Updating " + this.videoTitle + " on " + platform);
        System.out.println("-------------------------");

    }
}

/*
YouTube channel > Video Title  > Views on video
Static          > Instance     > Local

Comparison of Java Variable Scopes
    Variable Type	  Declaration Location	                    Scope (Visibility)	                                                Lifetime	                                                Default Value & Notes
    Local	          Inside a method, constructor, or block.	Limited to the specific block where it is declared.	                Exists only during method/block execution.	                None. Must be manually initialised before use or it causes a compiler error.
    Instance	      Inside a class, but outside any method.	Accessible by all non-static methods in the class.	                Exists as long as the object (instance) stays in memory.	Yes. Automatically assigned (e.g., 0 for int, null for String, false for boolean).
    Static	          Inside a class with the static keyword.	Shared across all instances; globally accessible within the class.	Exists for the entire duration of the program.	            Yes. Accessed via the class name (e.g., ClassName.varName) rather than an object.
*/
