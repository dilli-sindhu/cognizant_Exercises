# Exercise 1: Why CSS? Inline vs Internal vs External

## Scenario
The designer wants you to experiment with different ways to apply styles.

## Objective
Understand various CSS inclusion methods and their impact.

## Tasks Completed

### 1. Inline CSS
Applied an inline style to make the main heading red.

```html
<h1 style="color:red;">Local Community Event Portal</h1>
```

### 2. Internal CSS
Used an embedded `<style>` tag in the `<head>` section to set the body background color.

```html
<style>
body{
    background-color:#f4f4f4;
}
</style>
```

### 3. External CSS
Linked an external stylesheet named `styles.css` and moved reusable styles there.

```html
<link rel="stylesheet" href="styles.css">
```

### 4. CSS Comments
Added comments in the stylesheet to organize code.

```css
/* Header Styles */
h2{
    color: navy;
}
```

## Files
- index.html
- styles.css

## Output
(Add screenshot here)