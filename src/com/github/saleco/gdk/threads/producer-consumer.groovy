package com.github.saleco.gdk.threads

import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingQueue

BlockingQueue sharedQueue = [] as LinkedBlockingQueue

Thread.start("push") {
    10.times {
        try {
            println "${Thread.currentThread().name}\t: ${it}"
            sharedQueue << it
            sleep 100
        } catch (InterruptedException e) {
            //do something with this
        }
    }
}

Thread.start("pop") {
    for (i in 9..0) {
        sleep 200
        println "${Thread.currentThread().name}\t: ${sharedQueue.take()}"
    }
}