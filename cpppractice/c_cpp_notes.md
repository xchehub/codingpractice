# Reference
- https://shengyu7697.github.io/cpp-tutorial/
	- C/C++ 入門教學目錄
- https://opensourcedoc.com/data-structures-in-c/deque-in-list/
    - 開源教學資料結構使用 C基於連結串列 (Linked List) 的雙向佇列 (Deque)
- https://opensourcedoc.com/data-structures-in-c/linked-list/
    - [資料結構] 使用 C 語言：實作鏈結串列 (Linked List)
- https://opensourcedoc.com/data-structures-in-c/list-traversal/
    -  [資料結構] 使用 C 語言：串列走訪 (List Traversal)
- https://opensourcedoc.com/data-structures-in-c/ordered-list/
    - [資料結構] 使用 C 語言：實作有序串列 (Ordered List)
- http://kaiching.org/pydoing/index.html
    - http://kaiching.org/pydoing/c.html
    - http://kaiching.org/pydoing/cpp.html
- https://hackmd.io/@learnc/ByqzaxbZu
    - 重拾 C 語言::指標的部分
## C/C++ 入門教學目錄
- https://shengyu7697.github.io/cpp-tutorial/
- https://shengyu7697.github.io/std-mutex/
    - std::mutex 用法與範例
- https://shengyu7697.github.io/std-queue/
    - C++ std::queue 用法與範例
- https://shengyu7697.github.io/std-list/
    - std::list 用法與範例
- https://shengyu7697.github.io/std-stack/
    - C++ std::stack 用法與範例
- https://shengyu7697.github.io/std-vector/
    - C++ std::vector 用法與範例
- https://shengyu7697.github.io/cpp-pthread/
    - C/C++ Linux/Unix pthread 建立多執行緒用法與範例
- https://shengyu7697.github.io/cpp-function-return-by-reference/
    - C/C++ 函式回傳參考用法 function return by reference
- https://shengyu7697.github.io/cpp-call-by-value-pointer-reference/
    - C/C++ call by value傳值, call by pointer傳址, call by reference傳參考 的差別
- https://shengyu7697.github.io/cpp-extern/
    - C/C++ extern 用法與範例
- https://shengyu7697.github.io/cpp-static/
    - C/C++ static 的 5 種用法
- https://shengyu7697.github.io/cpp-const/
    - C/C++ const 的 3 種用法與範例
## mutex，lock，lock_guard
- https://cloud.tencent.com/developer/article/1583894
    - C++ 多线程互斥锁(mutex，lock，lock_guard)
- https://zhuanlan.zhihu.com/p/91062516
    - c++之多线程中“锁”的基本用法
## mutex semaphore
- https://jasonblog.github.io/note/linux_system/mutex_yu_semaphore_zui_da_de_cha_yi_shi.html
    - Mutex 與 Semaphore 最大的差異是
        - 30秒：最大的差異在於 Mutex 只能由上鎖的 thread 解鎖，而 Semaphore 沒有這個限制，可以由原本的 thread 或是另外一個 thread 解開。另外，Mutex 只能讓一個 thread 進入 critical section，Semaphore 的話則可以設定要讓幾個 thread 進入。這讓實際上使用 Mutex 跟 Semaphore 場景有很大的差別。
        - 60秒 (cont.)：舉例而言，Mutex 的兩個特性：一個是隻能有持鎖人解鎖、一個是在釋放鎖之前不能退出的特性，讓 Mutex 叫常使用在 critical section 只能有一個 thread 進入，而且要避免 priority inversion 的時候；Semaphore 也能透過 binary semaphore 做到類似的事情，卻沒有辦法避免 priority inversion 出現。
        - 120秒 (cont.)：而 Semaphore 更常是用在同步兩個 thread 或功能上面，因為 Semaphore 實際上使用的是 signal 的 up 與 down，讓 Semaphore 可以變成是一種 notification 的作用，例如 A thread 執行到某個地方時 B thread 才能繼續下去，就可以使用 Semaphore 來達成這樣的作用。
- https://ithelp.ithome.com.tw/articles/10279050
    - Day23 semaphore, mutex
- https://www.geeksforgeeks.org/mutex-vs-semaphore/
- https://welkinchen.pixnet.net/blog/post/47071066-spinlock-%26-mutex-%26-semaphore-%E7%9A%84%E4%BD%9C%E7%94%A8%E5%92%8C%E5%8D%80%E5%88%A5
    - spinlock & mutex & semaphore 的作用和區別
- https://www.guru99.com/mutex-vs-semaphore.html
- https://hackmd.io/@RinHizakura/rJhEpdyNw
    - Linux 核心設計: Synchronization
- https://hackmd.io/@nKngvyhpQdGagg1V6GKLwA/Skh9Z2DpX?type=view
    - Mutex and Semaphore
- https://www.tutorialspoint.com/mutex-vs-semaphore
    - Mutex vs Semaphore
## multiprocess
- https://stackoverflow.com/questions/6388031/multithreading-vs-multiprocessing


