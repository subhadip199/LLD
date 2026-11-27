# Low-Level Design (LLD)

A Java repository for learning **Low-Level Design, SOLID principles, and common object-oriented design patterns** through small, runnable examples.

## Repository Structure

```text
LLD/
├── src/
│   ├── absFactory/             # Abstract Factory pattern
│   ├── adapter/                # Adapter pattern
│   ├── builder/                # Builder pattern
│   ├── chainOfResponsibility/  # Chain of Responsibility pattern
│   ├── decorator/              # Decorator pattern
│   ├── factory/                # Factory pattern
│   ├── observer/               # Observer pattern
│   ├── prototype/              # Prototype pattern
│   ├── proxy/                  # Proxy pattern variants
│   ├── singleton/              # Singleton pattern
│   ├── solid/                  # SOLID principles
│   └── strategy/               # Strategy pattern
├── .gitignore
└── LLD.iml                     # IntelliJ IDEA module file
```

## Topics Covered

### SOLID Principles

| Principle | Package |
|---|---|
| Single Responsibility Principle | `src/solid/srp` |
| Open/Closed Principle | `src/solid/ocp` |
| Liskov Substitution Principle | `src/solid/lsp` |
| Interface Seg Segregation Principle | `src/solid/isp` |
| Dependency Inversion Principle | `src/solid/dip` |

### Design Patterns

- **Abstract Factory** — `src/absFactory`
- **Adapter** — `src/adapter`
- **Builder** — `src/builder`
- **Chain of Responsibility** — `src/chainOfResponsibility`
- **Decorator** — `src/decorator`
- **Factory** — `src/factory`
- **Observer** — `src/observer`
- **Prototype** — `src/prototype`
- **Proxy** — protection, remote, and virtual proxy examples in `src/proxy`
- **Singleton** — `src/singleton`
- **Strategy** — `src/strategy`

## Prerequisites

- Java Development Kit (JDK) 8 or later
- One of the following:
  - IntelliJ IDEA
  - Eclipse
  - A Java-compatible terminal and compiler

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/subhadip199/LLD.git
cd LLD
git switch master
```

### Open in IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Select **Open**.
3. Choose the repository directory.
4. Open `LLD.iml` or import the project.
5. Run the `Main` class inside any example package.

### Compile and Run from the Terminal

Examples can be compiled and run using their package names. For example:

```bash
javac src/singleton/*.java
java -cp src singleton.Main
```

Another example:

```bash
javac src/strategy/*.java
java -cp src strategy.Main
```

> The package names and `Main` classes vary by example. Compile all files from the package you want to run.

## Learning Approach

Each package demonstrates a focused design concept with a small executable example. Suggested areas to study:

1. Understand the problem in the example's `Main.java`.
2. Identify the responsibilities of each class.
3. Trace object creation and method calls.
4. Modify the example to see how the design responds to change.
5. Compare similar patterns, such as Factory and Abstract Factory.

## Language

- Java — 100%

## License

No license is currently specified for this repository.

## Contributing

Contributions, improvements, and additional Low-Level Design examples are welcome. When contributing:

1. Create a new branch.
2. Place an example in an appropriate package under `src`.
3. Keep examples focused and easy to understand.
4. Include a `Main` class that demonstrates the concept.
5. Open a pull request.
