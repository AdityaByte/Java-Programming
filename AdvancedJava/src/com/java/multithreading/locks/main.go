package main

import (
	"fmt"
	"sync"
)

func outerMethod(mux *sync.Mutex) {
	mux.Lock()
	defer mux.Unlock()
	fmt.Println("Outer method")
	innerMethod(mux)
}

func innerMethod(mux *sync.Mutex) {
	mux.Lock()
	fmt.Println("Inner method")
	mux.Unlock()
}

func main() {
	mux := sync.Mutex{}
	outerMethod(&mux)
}