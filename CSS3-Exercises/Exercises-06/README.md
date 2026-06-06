# Exercise 6: Link and List Styling

## Scenario
The default blue links and bullet lists don’t match the design.

## Objective
Customize links and lists.

## Tasks Completed

### 1. Styled Links Using Pseudo-Classes

```css
a:link {
    color: blue;
}

a:visited {
    color: purple;
}

a:hover {
    color: red;
}

a:active {
    color: green;
}
```

### 2. Removed Bullets from Navigation Menu

```css
.nav-menu {
    list-style-type: none;
}
```

### 3. Styled Lists

```css
.event-list {
    list-style-type: square;
    list-style-position: inside;
}
```

### 4. Added Spacing to List Items

```css
.event-list li {
    padding: 8px;
    margin: 5px 0;
}
```

## Concepts Practiced

- Link Pseudo Classes
- list-style-type
- list-style-position
- Removing Bullets
- Padding and Margin

## Files

- index.html
- styles.css

## Output

(Add screenshot here)