# Low-Level Design (LLD) in Java

A hands-on repository for learning **object-oriented design, SOLID principles, and classic design patterns** through small Java examples.

The goal is to understand not only *what* a pattern is, but also **when to use it, how the classes collaborate, and what trade-offs it introduces**.

## What you'll find

### SOLID principles

| Principle | Focus |
|---|---|
| Single Responsibility (SRP) | Keep a class focused on one responsibility |
| Open/Closed (OCP) | Extend behavior without repeatedly modifying stable code |
| Liskov Substitution (LSP) | Preserve expected behavior when substituting implementations |
| Interface Segregation (ISP) | Prefer focused interfaces over “fat” interfaces |
| Dependency Inversion (DIP) | Depend on abstractions rather than concrete details |

Examples are under `src/solid/`.

### Design patterns

| Pattern | Example location |
|---|---|
| Abstract Factory | `src/absFactory/` |
| Adapter | `src/adapter/` |
| Builder | `src/builder/` |
| Chain of Responsibility | `src/chainOfResponsibility/` |
| Decorator | `src/decorator/` |
| Factory | `src/factory/` |
| Observer | `src/observer/` |
| Prototype | `src/prototype/` |
| Proxy | `src/proxy/` |
| Singleton | `src/singleton/` |
| Strategy | `src/strategy/` |

Each example is organized by topic. Check the package's `Main` class to see how the example is exercised.

## Getting started

### Requirements

- JDK 8 or later
- IntelliJ IDEA, Eclipse, or a terminal with the Java compiler

### Clone the repository

```bash
git clone https://github.com/subhadip199/LLD.git
cd LLD
git switch master
```

### Run an example

From the repository root, compile the Java files in the package and run its main class. For example:

```bash
javac src/singleton/*.java
java -cp src singleton.Main
```

Or:

```bash
javac src/strategy/*.java
java -cp src strategy.Main
```

The examples are independent; package names and entry-point class names may vary. If a package contains subpackages or additional source files, compile the relevant files together.

## Suggested learning path

1. **Start with the problem.** Read the example's `Main.java` and identify what needs to change or vary.
2. **Trace the collaboration.** Follow object creation and method calls between the classes.
3. **Connect the design to SOLID.** Ask which responsibility or dependency the design is trying to improve.
4. **Test a change.** Add a new behavior or implementation and observe which existing classes need modification.
5. **Review the trade-offs.** Consider added indirection, complexity, flexibility, and testability.

For interview practice, try explaining each example in this order: **problem → design → class responsibilities → collaboration → trade-offs**.

## Repository layout

```text
src/
├── solid/
└── <pattern packages>/
```

The source tree is organized by principle or pattern. Browse the package folders for the corresponding Java examples.

## Contributing

Ideas for additional patterns, clearer examples, and improvements are welcome.

- Keep each example focused on one concept.
- Prefer readable, idiomatic Java.
- Include a small runnable demonstration when appropriate.
- Explain the design decision and any important trade-offs.

## License

No license is currently specified.