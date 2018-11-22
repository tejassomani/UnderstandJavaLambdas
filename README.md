## Output

Built in Functional Interface Types

Type Supplier -> Has a RETURN VALUE, no input
Value supplied by supplier is 2

Type Consumer/BiConsumer -> No RETURN VALUE, Consumes Input
ABC

Type Predicate/BiPredicate -> Returns boolean, takes Input <T> or <T, U>
Predicate's boolean return value is true

Type Function/BiFunction -> Returns object Type (R), takes Input <T> or <T, U>
Length of input for Function's return value is 4

Type Unary/BinaryOperator -> Returns object Type (T), takes Input <T> or <T, U>
Value returned by Unary Operator is TEST AGAIN

Intermediate Operations
Filter: Starts with T: Tiger
Skip 2 elements and limit output to 4 after skipping 3
Skip 2 elements and limit output to 4 after skipping 4
Skip 2 elements and limit output to 4 after skipping 5
Skip 2 elements and limit output to 4 after skipping 6

Map to length of String 5
Map to length of String 4
Map to length of String 5

FlatMap:
Zebra
Lion
Tiger

FlatMap Distinct and Sorted:
Lion
Tiger
Zebra

Terminal Operations
Count: 3

Min: Lion

Find First: Tiger

Any Match True: true

Any Match False: false

Reduce: TigerLionZebra

Collect: 
w:o:l:f

Collectors
Average length of strings4.666666666666667
Collect into a map
{Zebra=5, Lion=4, Tiger=5}
Collect into a map for length and string
{4=Lion, 5=Tiger, Zebra}
Grouping and Mapping
{4=[Lion], 5=[Tiger, Zebra]}
Grouping and Getting a Count
{4=1, 5=2}

Checked Exceptions
