#include <stdio.h>
#include <stdlib.h>

// Function to swap values using pointers (call by reference)
void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main() {

    // 1️⃣ Basic Pointer
    int x = 10;
    int *p = &x;

    printf("Basic Pointer:\n");
    printf("Value of x = %d\n", x);
    printf("Address of x = %p\n", &x);
    printf("Pointer p holds address = %p\n", p);
    printf("Value at address p = %d\n\n", *p);


    // 2️⃣ Pointer with Array
    int arr[3] = {100, 200, 300};
    int *ptr = arr;   // same as &arr[0]

    printf("Pointer with Array:\n");
    for(int i=0; i<3; i++) {
        printf("Value = %d Address = %p\n", *(ptr+i), (ptr+i));
    }
    printf("\n");


    // 3️⃣ Pointer Arithmetic
    printf("Pointer Arithmetic:\n");
    printf("First element = %d\n", *ptr);
    printf("Second element = %d\n", *(ptr+1));
    printf("Third element = %d\n\n", *(ptr+2));


    // 4️⃣ Call by Reference using Pointer
    int a = 5, b = 9;
    printf("Before swap: a=%d b=%d\n", a, b);
    swap(&a, &b);
    printf("After swap:  a=%d b=%d\n\n", a, b);


    // 5️⃣ Double Pointer
    int y = 50;
    int *p1 = &y;
    int **p2 = &p1;

    printf("Double Pointer:\n");
    printf("Value of y = %d\n", y);
    printf("Using *p1 = %d\n", *p1);
    printf("Using **p2 = %d\n\n", **p2);


    // 6️⃣ Dynamic Memory Allocation using Pointer
    int *dyn;
    dyn = (int*) malloc(3 * sizeof(int));

    printf("Dynamic Memory Allocation:\n");
    for(int i=0;i<3;i++){
        dyn[i] = (i+1)*10;
        printf("%d ", dyn[i]);
    }

    free(dyn);   // always free allocated memory
    printf("\n");

    return 0;
}