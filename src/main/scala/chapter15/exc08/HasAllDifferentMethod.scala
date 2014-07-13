package chapter15.exc08

/**
 *
 * Created by Kirill Feoktistov on 13.07.14
 */

object HasAllDifferentMethod {
  def allDifferent[@specialized T](x: T, y: T, z: T) = x != y && x != z && y != z
}


/*
javap -private -c HasAllDiff
erentMethod.class

// specialization

Compiled from "HasAllDifferentMethod.scala"
public final class chapter15.exc08.HasAllDifferentMethod {
  public static final <T extends java/lang/Object> boolean allDifferent(T, T, T);
    Code:
       0: getstatic     #11                 // Field chapter15/exc08/HasAllDifferentMethod$.MODULE$:Lchapter15/exc08/HasAllDifferentMethod$;
       3: aload_0
       4: aload_1
       5: aload_2
       6: invokevirtual #13                 // Method chapter15/exc08/HasAllDifferentMethod$.allDifferent:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
       9: ireturn
}




// after specialization

Compiled from "HasAllDifferentMethod.scala"
public final class chapter15.exc08.HasAllDifferentMethod {
  public static final <T extends java/lang/Object> boolean allDifferent(T, T, T);
    Code:
       0: getstatic     #11                 // Field chapter15/exc08/HasAllDifferentMethod$.MODULE$:Lchapter15/exc08/HasAllDifferentMethod$;
       3: aload_0
       4: aload_1
       5: aload_2
       6: invokevirtual #13                 // Method chapter15/exc08/HasAllDifferentMethod$.allDifferent:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
       9: ireturn
}

*/