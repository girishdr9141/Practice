#include <stdio.h>
#include <stdbool.h>

enum BOOLEAN {
    TRUE = 100,
    FALSE,
    X,
    Y,
    Z
};

int main() {
    bool status = true;
    enum BOOLEAN f = FALSE;

    printf("%d\n", status);
    printf("%d\n", f);
    printf("Size of enum: %llu Bytes\n", (unsigned int)sizeof(f));

    return 0;
}
