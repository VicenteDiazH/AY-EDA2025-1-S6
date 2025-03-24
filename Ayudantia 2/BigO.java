/*
Pregunta 1:
 
for (int i = 0; i < n; i++) {
    System.out.println(i);
}

¿Cuál es la complejidad?

A) O(1)
B) O(n)
C) O(n^2)
D) O(log n)

----------------------------------------------------------------------------------------------------------------------------------

Pregunta 2:

for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + j);
    }
}

¿Cuál es la complejidad?

A) O(n)
B) O(n log n)
C) O(n^2)
D) O(n^3)

----------------------------------------------------------------------------------------------------------------------------------

Pregunta 3:

for (int i = 1; i < n; i *= 2) {
    System.out.println(i);
}

¿Cuál es la complejidad?

A) O(log n)
B) O(n log n)
C) O(n)
D) O(1)
 
----------------------------------------------------------------------------------------------------------------------------------

Pregunta 4:

int a = 0;
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        a += i + j;
    }
}
System.out.println(a);

¿Cuál es la complejidad?

A) O(n)
B) O(n^2)
C) O(n^3)
D) O(log n)
 
----------------------------------------------------------------------------------------------------------------------------------

Pregunta 5:

for (int i = 0; i < n; i++) {
    for (int j = 0; j < i; j++) {
        System.out.println(i + j);
    }
}

¿Cuál es la complejidad?

A) O(n log n)
B) O(n^2)
C) O(n^3)
D) O(n)
 
----------------------------------------------------------------------------------------------------------------------------------

Pregunta 6:

for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j += 2) {
        System.out.println(i + j);
    }
}

¿Cuál es la complejidad?

A) O(n)
B) O(n^2)
C) O(n log n)
D) O(n^3)
 
----------------------------------------------------------------------------------------------------------------------------------

Pregunta 7:
 
int a = 1;
while (a < n) {
    a *= 2;
    System.out.println(a);
}

¿Cuál es la complejidad?

A) O(n)
B) O(log n)
C) O(n^2)
D) O(1)
 
----------------------------------------------------------------------------------------------------------------------------------

Pregunta 8:
 
int a = 0;
for (int i = 0; i < n; i++) {
    a += i;
}
for (int j = 0; j < m; j++) {
    a += j;
}
System.out.println(a);

¿Cuál es la complejidad?

A) O(n + m)
B) O(n^2 + m^2)
C) O(n * m)
D) O(n^2)
 
----------------------------------------------------------------------------------------------------------------------------------

Pregunta 9:
 
for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {
        System.out.println(i + j);
    }
}

¿Cuál es la complejidad?

A) O(n log n)
B) O(n^2)
C) O(n^3)
D) O(n)

----------------------------------------------------------------------------------------------------------------------------------

Pregunta 10:
 
for (int i = 0; i < n; i++) {
    for (int j = 0; j < Math.sqrt(n); j++) {
        System.out.println(i + j);
    }
}

¿Cuál es la complejidad?

A) O(n)
B) O(n^2)
C) O(n sqrt(n))
D) O(n log n)

----------------------------------------------------------------------------------------------------------------------------------

Pregunta 11:
 
for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {
        for (int k = 0; k < n; k++) {
            System.out.println(i + j + k);
        }
    }
}

¿Cuál es la complejidad?

A) O(n^2)
B) O(n^3)
C) O(n^4)
D) O(n^2 log n)
 
----------------------------------------------------------------------------------------------------------------------------------

Pregunta 12:
 
for (int i = 0; i < n; i++) {
    for (int j = 0; j < i * i; j++) {
        for (int k = 0; k < j; k++) {
            System.out.println(i + j + k);
        }
    }
}

¿Cuál es la complejidad?

A) O(n^4)
B) O(n^3)
C) O(n^5)
D) O(n^6)
 
----------------------------------------------------------------------------------------------------------------------------------

Pregunta 13:
 
int a = 1;
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        a *= 2;
    }
}
System.out.println(a);

¿Cuál es la complejidad?

A) O(n log n)
B) O(n^2)
C) O(n^3)
D) O(log n)
 
----------------------------------------------------------------------------------------------------------------------------------

Pregunta 14:
 
for (int i = 0; i < n; i++) {
    for (int j = 0; j < i; j++) {
        for (int k = 0; k < j; k++) {
            System.out.println(i + j + k);
        }
    }
}

¿Cuál es la complejidad?

A) O(n^3)
B) O(n^4)
C) O(n^5)
D) O(n^2)
 
----------------------------------------------------------------------------------------------------------------------------------

Pregunta 15:
 
for (int i = 1; i < n; i *= 2) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + j);
    }
}

¿Cuál es la complejidad?

A) O(n log n)
B) O(n^2)
C) O(log n)
D) O(n)

----------------------------------------------------------------------------------------------------------------------------------

Respuestas:
1)  B) O(n)
2)  C) O(n^2)
3)  A) O(log n)
4)  B) O(n^2)
5)  B) O(n^2)
6)  B) O(n^2)
7)  B) O(log n)
8)  A) O(n + m)
9)  B) O(n^2)
10) C) O(n sqrt(n))
11) B) O(n^3)
12) A) O(n^4)
13) B) O(n^2)
14) A) O(n^3)
15) A) O(n log n)
*/