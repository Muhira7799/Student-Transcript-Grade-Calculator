
# Student Transcript – Grade Calculator

A Java console application that reads marks for five subjects, assigns a letter grade to each one, and then calculates the total, the average, and a final grade.

## Features

- Reads marks for 5 subjects from the user
- Prints a letter grade after each mark is entered
- Calculates the total marks and the average
- Assigns a final grade based on the average

## Grading Scale

| Mark / Average | Grade |
|----------------|-------|
| 85 and above | A |
| 75 to 84.99 | B |
| 60 to 74.99 | C |
| Below 60 | D |

The same scale is used for each subject and for the final grade.

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

### Clone the repository

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
```

### Compile

```bash
javac StudentTranscript.java
```

### Run

```bash
java StudentTranscript
```

## Sample Run

```
Enter mark for subject 1: 90
Grade A
Enter mark for subject 2: 78
Grade B
Enter mark for subject 3: 65
Grade C
Enter mark for subject 4: 55
Grade D
Enter mark for subject 5: 82
Grade B
Total marks: 370.0
Average: 74.0
Final Grade: C
```

## How It Works

1. A `for` loop runs 5 times, once per subject.
2. Each mark is read with `Scanner` and added to the running total.
3. An `if / else if` chain prints the grade for that mark.
4. After the loop, the average is calculated as `total / 5`.
5. The same grading scale is applied to the average to print the final grade.

## Possible Improvements

- Validate marks so only values from 0 to 100 are accepted
- Handle non-numeric input with `try-catch` or `hasNextDouble()`
- Ask for subject names and the student's name
- Store marks in an array to support a different number of subjects
- Move the grading logic into a separate method to avoid repeating it

## Project Structure

```
.
├── StudentTranscript.java
└── README.md
```
