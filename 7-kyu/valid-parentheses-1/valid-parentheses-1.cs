using System;
using System.Collections.Generic;
public class Kata
{
    public static bool ValidParentheses(string str)
    {
        Stack<char> stack = new Stack<char>();
        Dictionary<char, char> pairs = new Dictionary<char, char>
        {
            {'(', ')'}
        };
​
        foreach (char ch in str)
        {
            if (pairs.ContainsKey(ch))
            {
​
                stack.Push(ch);
            }
            else if (pairs.ContainsValue(ch))
            {
                if (stack.Count == 0) return false;
                char open = stack.Pop();
                if (pairs[open] != ch) return false;
            }
        }
​
        return stack.Count == 0; 
    }
}