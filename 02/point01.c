#include <stdio.h>

int main() {
    int a = 10;
    //���еģ���Ϊpa�ǵ�ַ����a��һ�������ֵ
    //int *pa = a;
    int *pa = &a;
    printf("%p,%p\n",&a,pa);
    //*paָ���ǻ�ȡpa�����ַ�еĴ洢�ı���
    printf("%d,%d\n",*&a,*pa);
}
