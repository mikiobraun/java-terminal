/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.marge.javaterminal;

/**
 * The Terminal class provides low-level access to the usual terminal capabilities,
 * modelled after what is available under UNIX, but also provided on Windows systems.
 *
 * @author mikio
 */
public interface Terminal {
    /*
     * Basic Input/Output
     */

    /** Read a character. */
    public char getch();

    /** Print a character. */
    public void putch(char c);

    /** Flush whatever is in the buffer. */
    public void flush();

    /*
     * Cursor movement.
     */

    /** Move to given coordinate. */
    public void moveTo(Coordinate c);

    /** Move cursor home (upper left corner). */
    public void moveHome();

    /** Move cursor left. */
    public void moveLeft();

    /** Move cursor up. */
    public void moveUp();

    /** Move cursor down. */
    public void moveDown();

    /** Move cursor right. */
    public void moveRight();

    /** Get current position. */
    public Coordinate getPosition();

    /*
     * Screen size.
     */

    /** Get terminal screen size. */
    public Size getSize();

    /** Add a listener which will be called when the size changed. */
    public void addSizeChangeListener(SizeChangeListener l);

    /*
     * Input/Output modes.
     */

    /** Set echoing of input characters to given state. */
    public void setEcho(boolean echo);

    /**
     * Set whether control characters (e.g. CTRL-C) will be read in
     * or passed to the terminal. Setting this to true will mean you cannot
     * stop your program with CTRL-C anymore from the console!
     */
    public void setRaw(boolean raw);

    /*
     * Controlling output color and attributes.
     */

    /** Set foreground color. */
    public void setForegroundColor(Color c);

    /** Set background color. */
    public void setBackgroundColor(Color c);

    /** Set attribute (BOLD, UNDERLINED, etc.). */
    public void setAttribute(Attribute a);

    /*
     * Clearing and erasing.
     */

    /** Erase everything till end-of-line. */
    public void eraseToEndOfLine();

    /** Erase everything till start-of-line. */
    public void eraseToStartOfLine();

    /** Erase the screen. */
    public void eraseScreen();

    /** Erase the line. */
    public void eraseLine();

    /** Erase from current line till top of screen. */
    public void eraseUp();

    /** Erase from current line till bottom of screen. */
    public void eraseDown();

    /*
     * Scrolling
     */
    /** Enable scrolling for whole screen. */
    public void enableScrollWholeScreen();

    /** Enable scrolling for given range of lines. */
    public void enableScrollForLines(int line1, int line2);

    /** Scroll given region down. */
    public void scrollDown();

    /** Scroll given region up. */
    public void scrollUp();
}
