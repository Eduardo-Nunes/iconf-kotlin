package _02_properties

import kotlin.reflect.KProperty


var p1: String = "initial"
    get() {
        println("You read me")
        return field
    }
    set(v) {
        println("You write me")
        field = v
    }

var p2: String = "initial"
    get() {
        println("You read me")
        return field
    }
    set(v) {
        println("You write me")
        field = v
    }










var p3 by Prop("initial")
var p4 by Prop("initial")
var p5 by Prop("initial")


class Prop(var field: String){
    operator fun getValue(thisRef: Any?, p:KProperty<*>): String{
        println("You read me")
        return field
    }

    operator fun setValue(thisRef: Any?, p:KProperty<*>, v: String){
        println("You write me")
        field = v
    }
}