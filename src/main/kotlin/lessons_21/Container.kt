package com.Nikita.lessons_21

import java.awt.CheckboxMenuItem
import java.util.Objects

class Container<T>(val item: T) {
}

class PairBox<A, B>(val first: A, val second: B) {
}

class LimitedContainer<A : Number>(val item: A?) {

}

interface Storage<T> {
    fun set(item: T)
    fun get(): T
}

interface Transformer<A, B> {
    fun transform(item: A): B
}

fun <Q> swap(list: List<Q>, index1: Int, index2: Int): List<Q> {
    return TODO("Provide the return value")
}

fun <W> second(list1: List<W>, list2: List<W>): List<W> {
    return TODO("Provide the return value")
}

fun <K, V> toMap(keys: List<K>, vaalues: List<V>): Map<K, V> {
    return TODO("Provide the return value")
}

