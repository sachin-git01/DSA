SORTING NOTES – INTERVIEW PREPARATION

1. WHAT IS SORTING?

Sorting is the process of arranging elements in a particular order.

Example:

Unsorted:
5 2 8 1 3

Ascending:
1 2 3 5 8

Descending:
8 5 3 2 1

2. WHY DO WE USE SORTING?

Sorting is useful for:

* Organizing data
* Faster searching
* Finding duplicates
* Ranking elements
* Applying Binary Search
* Easier data processing

3. TYPES OF SORTING

A. Comparison-Based Sorting

Elements are compared with each other.

Examples:

* Bubble Sort
* Selection Sort
* Insertion Sort
* Merge Sort
* Quick Sort
* Heap Sort

  BUBBLE SORT vs SELECTION SORT vs INSERTION SORT

Point                 Bubble Sort         Selection Sort       Insertion Sort
--------------------------------------------------------------------------------
Main Idea             Adjacent compare    Find minimum         Shift and insert
                      and swap

Main Operation        Swapping            Selection + Swap     Shifting

Best Case             O(n)*               O(n²)                O(n)

Average Case          O(n²)               O(n²)                O(n²)

Worst Case            O(n²)               O(n²)                O(n²)

Space Complexity      O(1)                O(1)                 O(1)

Stable                Yes                 No                   Yes

In-place              Yes                 Yes                  Yes

Adaptive              Yes*                No                   Yes

Nearly Sorted Data    Good                Poor                 Excellent

Number of Swaps       High                Low                  Less swapping,
                                                               more shifting

Working Style         Largest element     Smallest element     Current key is
                      bubbles to end      selected and placed  inserted into
                                          at correct position  sorted part
B. Non-Comparison Sorting

Elements are sorted without directly comparing every element.

Examples:

* Counting Sort
* Radix Sort
* Bucket Sort

---

4. BUBBLE SORT

---

Definition:

Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.

Main Idea:

Compare adjacent elements
→ Swap if required
→ Largest element reaches the end

Example:

5 3 2

5 and 3 → Swap

3 5 2

5 and 2 → Swap

3 2 5

After one complete pass, the largest element reaches the end.

Code:

static void bubbleSort(int[] arr) {

```
for (int i = 0; i < arr.length - 1; i++) {

    for (int j = 0; j < arr.length - 1 - i; j++) {

        if (arr[j] > arr[j + 1]) {

            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
    }
}
```

}

Why do we use arr.length - 1 - i?

After every pass, one largest element is already placed at the end.

So we do not need to compare it again.

Complexity:

Best Case:
O(n) – Optimized Bubble Sort

Average Case:
O(n²)

Worst Case:
O(n²)

Space Complexity:
O(1)

Properties:

Stable: Yes

In-place: Yes

Adaptive: Optimized version can be adaptive

Interview Definition:

Bubble Sort is a comparison-based sorting algorithm that repeatedly compares adjacent elements and swaps them when they are in the wrong order.

---

5. SELECTION SORT

---

Definition:

Selection Sort repeatedly finds the smallest element from the unsorted part and places it at the current position.

What is Current Position?

Current position means:

arr[i]

It is the position where the smallest element of the current pass should be placed.

Example:

3 2 5 1

i = 0

Current Position = index 0

Find smallest element:

Smallest = 1

Swap 1 with 3.

Result:

1 2 5 3

Now index 0 is sorted.

How Selection Sort Works:

Step 1:
Assume arr[i] is the smallest element.

Step 2:
Search the remaining unsorted array.

Step 3:
If a smaller element is found, store its index.

Step 4:
After checking the complete unsorted part, swap the smallest element with arr[i].

Step 5:
Move to the next position.

Code:

static void selectionSort(int[] arr) {

```
for (int i = 0; i < arr.length - 1; i++) {

    int smallest = i;

    for (int j = i + 1; j < arr.length; j++) {

        if (arr[j] < arr[smallest]) {
            smallest = j;
        }
    }

    int temp = arr[i];
    arr[i] = arr[smallest];
    arr[smallest] = temp;
}
```

}

Why smallest = i?

Initially, we assume that the element at the current position is the smallest element.

Why is swapping done outside the inner loop?

Selection Sort first finds the smallest element from the complete unsorted portion.

After finding it, we perform only one swap.

Find minimum
→ Swap once

Complexity:

Best Case:
O(n²)

Average Case:
O(n²)

Worst Case:
O(n²)

Space Complexity:
O(1)

Properties:

Stable: No

In-place: Yes

Adaptive: No

Maximum Swaps:
Approximately n - 1

Main Advantage:

Selection Sort performs fewer swaps.

Main Disadvantage:

It is slow for large arrays because its time complexity is O(n²).

Interview Definition:

Selection Sort is an in-place comparison-based sorting algorithm that repeatedly selects the minimum element from the unsorted part and places it at the current position.

---

6. INSERTION SORT

---

Definition:

Insertion Sort builds the sorted part of the array one element at a time.

It takes the current element as a key, shifts larger elements to the right, and inserts the key at the correct position.

Main Idea:

Take key
→ Shift bigger elements to the right
→ Insert key

Example:

2 5 7 3

key = 3

Shift 7 right:

2 5 7 7

Shift 5 right:

2 5 5 7

Insert 3:

2 3 5 7

Code:

static void insertionSort(int[] arr) {

```
for (int i = 1; i < arr.length; i++) {

    int key = arr[i];
    int j = i - 1;

    while (j >= 0 && arr[j] > key) {

        arr[j + 1] = arr[j];
        j--;
    }

    arr[j + 1] = key;
}
```

}

Why does Insertion Sort start from i = 1?

The first element is considered already sorted.

What does this line do?

arr[j + 1] = arr[j];

It shifts the larger element one position to the right.

What does j-- do?

It moves j one position towards the left.

Why do we use j >= 0?

It prevents us from accessing an invalid array index such as:

arr[-1]

Why do we store key?

Because shifting elements may overwrite the original current element.

The key variable safely stores that value until its correct position is found.

Complexity:

Best Case:
O(n)

Average Case:
O(n²)

Worst Case:
O(n²)

Space Complexity:
O(1)

Properties:

Stable: Yes

In-place: Yes

Adaptive: Yes

Very good for nearly sorted arrays.

Interview Definition:

Insertion Sort builds a sorted portion one element at a time by inserting every element into its correct position.

---

7. MERGE SORT

---

Definition:

Merge Sort is a Divide and Conquer sorting algorithm.

It divides the array into smaller parts, sorts them and merges them back.

Main Idea:

Divide
→ Sort
→ Merge

Example:

5 2 4 1

Divide:

5 2     4 1

Again divide:

5   2   4   1

Merge:

2 5     1 4

Final:

1 2 4 5

Complexity:

Best Case:
O(n log n)

Average Case:
O(n log n)

Worst Case:
O(n log n)

Space Complexity:
O(n)

Properties:

Stable: Yes

In-place: Usually No

Good for large datasets.

Interview Definition:

Merge Sort is a divide-and-conquer algorithm that divides the array into smaller subarrays, sorts them, and merges them back together.

---

8. QUICK SORT

---

Definition:

Quick Sort is a Divide and Conquer sorting algorithm.

It selects a pivot and places smaller elements on one side and larger elements on the other side.

Main Idea:

Choose Pivot
→ Partition
→ Sort left and right parts

Example:

5 2 7 1 4

Pivot = 4

After partition:

1 2 | 4 | 7 5

Complexity:

Best Case:
O(n log n)

Average Case:
O(n log n)

Worst Case:
O(n²)

Properties:

Stable: Usually No

In-place: Usually Yes

Very fast in practical situations.

Interview Definition:

Quick Sort selects a pivot, partitions the array around the pivot, and recursively sorts the left and right partitions.

---

9. HEAP SORT

---

Definition:

Heap Sort uses the Heap data structure to sort elements.

For ascending sorting, a Max Heap is generally used.

Main Idea:

Build Max Heap
→ Take largest element
→ Move it to the end
→ Heapify again

Complexity:

Best Case:
O(n log n)

Average Case:
O(n log n)

Worst Case:
O(n log n)

Space Complexity:
O(1)

Properties:

Stable: No

In-place: Yes

Guaranteed O(n log n) time complexity.

---

10. STABLE SORTING

---

A sorting algorithm is stable if equal elements maintain their original relative order.

Example:

A(5), B(3), C(5)

After stable sorting:

B(3), A(5), C(5)

A was before C originally, so it remains before C.

Stable Sorting Algorithms:

* Bubble Sort
* Insertion Sort
* Merge Sort

Usually Not Stable:

* Selection Sort
* Quick Sort
* Heap Sort

---

11. IN-PLACE SORTING

---

An in-place sorting algorithm sorts the original array without using another large array.

Usually Extra Space:

O(1)

Examples:

* Bubble Sort
* Selection Sort
* Insertion Sort
* Heap Sort

---

12. ADAPTIVE SORTING

---

An adaptive sorting algorithm performs better when the array is already or nearly sorted.

Examples:

* Insertion Sort
* Optimized Bubble Sort

Selection Sort is not adaptive.

---

13. INTERNAL SORTING

---

Internal Sorting is used when all the data can fit into the main memory (RAM).

Examples:

* Quick Sort
* Heap Sort
* Insertion Sort

---

14. EXTERNAL SORTING

---

External Sorting is used when the amount of data is too large to fit into RAM.

Example:

External Merge Sort

---

15. BUBBLE VS SELECTION VS INSERTION

---

Bubble Sort:

Main Idea:
Compare adjacent elements.

Operation:
Swap.

Best:
O(n) optimized.

Average:
O(n²)

Worst:
O(n²)

Stable:
Yes

In-place:
Yes

Nearly Sorted Data:
Good

Selection Sort:

Main Idea:
Find minimum element.

Operation:
Select + Swap.

Best:
O(n²)

Average:
O(n²)

Worst:
O(n²)

Stable:
No

In-place:
Yes

Nearly Sorted Data:
Not good

Insertion Sort:

Main Idea:
Take key and insert it at correct position.

Operation:
Shift + Insert.

Best:
O(n)

Average:
O(n²)

Worst:
O(n²)

Stable:
Yes

In-place:
Yes

Nearly Sorted Data:
Excellent

---

16. COMPLEXITY CHEAT SHEET

---

Bubble Sort:

Best:
O(n) optimized

Average:
O(n²)

Worst:
O(n²)

Space:
O(1)

Selection Sort:

Best:
O(n²)

Average:
O(n²)

Worst:
O(n²)

Space:
O(1)

Insertion Sort:

Best:
O(n)

Average:
O(n²)

Worst:
O(n²)

Space:
O(1)

Merge Sort:

Best:
O(n log n)

Average:
O(n log n)

Worst:
O(n log n)

Space:
O(n)

Quick Sort:

Best:
O(n log n)

Average:
O(n log n)

Worst:
O(n²)

Heap Sort:

Best:
O(n log n)

Average:
O(n log n)

Worst:
O(n log n)

Space:
O(1)

---

17. MOST ASKED INTERVIEW QUESTIONS

---

Q1. What is Sorting?

Sorting is the process of arranging elements in a specific order, usually ascending or descending.

Q2. Why is Sorting important?

Sorting helps in faster searching, better organization, ranking, duplicate detection and easier data processing.

Q3. Which sorting algorithm is best?

There is no single best sorting algorithm.

Nearly Sorted Data:
Insertion Sort

Guaranteed O(n log n):
Merge Sort / Heap Sort

Fast in Practice:
Quick Sort

Small Arrays:
Insertion Sort

Q4. Which basic sorting algorithm performs fewer swaps?

Selection Sort.

Q5. Which sorting algorithm is best for nearly sorted arrays?

Insertion Sort.

Q6. Why does Bubble Sort use n - 1 - i?

Because after every pass, one largest element is already placed at the end.

Q7. Why does Insertion Sort start from index 1?

Because the first element is considered already sorted.

Q8. Why do we use j >= 0 in Insertion Sort?

To prevent accessing an invalid array index such as arr[-1].

Q9. Why is Selection Sort not stable?

Because swapping the minimum element with the current element may change the relative order of equal elements.

Q10. Which algorithms are stable?

Bubble Sort

Insertion Sort

Merge Sort

Q11. Which algorithms are usually not stable?

Selection Sort

Quick Sort

Heap Sort

Q12. Which sorting algorithms have guaranteed O(n log n) time complexity?

Merge Sort

Heap Sort

Q13. Which sorting algorithm can become O(n²) in the worst case?

Quick Sort.

Q14. What is an in-place sorting algorithm?

An algorithm that sorts the original array using very little extra memory.

Q15. What is an adaptive sorting algorithm?

An algorithm that performs better when the input is already or nearly sorted.

Q16. What is the lower bound for comparison-based sorting?

Ω(n log n)

---

18. ONE-LINE REVISION

---

Bubble Sort:

Compare adjacent elements
→ Swap

Selection Sort:

Find smallest
→ Swap with current position

Insertion Sort:

Take key
→ Shift bigger elements
→ Insert key

Merge Sort:

Divide
→ Sort
→ Merge

Quick Sort:

Choose pivot
→ Partition

Heap Sort:

Build heap
→ Extract largest

---

19. FINAL INTERVIEW RULE

---

For every sorting algorithm, remember these 6 things:

1. Definition
2. Main Logic
3. Code
4. Time Complexity
5. Space Complexity
6. Stable / In-place

Most Important Sorting Algorithms for Interviews:

Bubble Sort
→ Selection Sort
→ Insertion Sort
→ Merge Sort
→ Quick Sort
→ Heap Sort
