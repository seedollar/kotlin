/**
 * Created by seedollar on 5/30/16.
 */

fun main(args : Array<String>) {
    println(String.format("Program arguments: %s", ifStatement(args)));
}

fun ifStatement(args : Array<String>) = if (args.size == 0) "none" else args[0];
