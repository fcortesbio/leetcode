# LeetCode Algorithm Challenges in Java

This repository documents my journey of solving LeetCode algorithm problems using Java. It serves as a personal log of my progress and a collection of my solutions.

## Project Structure

Each algorithm problem is organized into its own directory. The directory name corresponds to the problem's title on LeetCode. Inside each directory, you will find:

*   `description.md`: A Markdown file containing the problem description from LeetCode.
*   `Main.java`: The Java file with my implementation of the solution.

For example:
```
/
├── 01-two-sum/
│   ├── Description.md
│   └── Main.java
└── 02-add-two-numbers/
    ├── description.md
    └── Main.java
```

## Development Environment

Although no strict matching is required

*   **Java:** OpenJDK 25.0.1
*   **Bash:** 5.3.8
*   **OS:** Arch Linux x86_64

## Development Workflow

I follow a Test-Driven Development (TDD) inspired workflow:

1.  **Write a Failing Test:** I start by writing a test case that initially fails.
2.  **Implement the Solution:** I then write the code to make the test pass.
3.  **Refactor:** Finally, I refactor the code for clarity, efficiency, and to adhere to best practices.

## How to Compile and Run

To streamline the compilation and execution process, I use a bash function called `jrun`. This function compiles a Java file, runs it, and then cleans up the compiled `.class` files.

You can add this function to your `.bashrc` or `.zshrc` file:

```bash
# jrun: Compile and run a Java file, then clean up .class files
jrun() {
  if [ -z "$1" ]; then
    echo "Usage: jrun <file.java> [args...]"
    return 1
  fi

  local file="$1"
  shift 1

  if [[ ! -f "$file" ]]; then
    echo "Error: File '$file' not found."
    return 1
  fi

  local classname="${file%.java}"
  
  # Compile the Java file
  javac "$file"
  if [ $? -ne 0 ]; then
    echo "Compilation failed."
    return 1
  fi

  # Run the compiled class
  java "$classname" "$@"
  
  # Clean up the .class file
  rm -f "${classname}.class"
}
```

### Usage

To run a solution, navigate to the problem's directory and use `jrun` with the `Main.java` file:

```sh
cd 01-two-sum
jrun Main.java
```

## My Progress

Here is a list of the algorithms I have solved so far:

*   [01-two-sum](./01-two-sum/)
<!--*   [02-add-two-numbers](./02-add-two-numbers/)-->

## Future Goals

I plan to add solutions to new algorithm problems at least three times per week.
