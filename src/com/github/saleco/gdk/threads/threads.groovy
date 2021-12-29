package com.github.saleco.gdk.threads

def t = new Thread() { /* do something */ }

t.start()

Thread.start { /* do something */ }
Thread.start("thread-name")  { /* do something */ }

Thread.startDaemon { /* do something */ }
Thread.startDaemon("thread-name") { /* do something */ }

