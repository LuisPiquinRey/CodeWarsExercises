using System;
using System.Collections.Generic;
using System.Linq;
​
public class DnaStrand 
{
    public static string MakeComplement(string dna)
    {
        var conv = new Dictionary<char, char>
        {
            {'A', 'T'},
            {'T', 'A'},
            {'C', 'G'},
            {'G', 'C'}
        };
​
        return string.Concat(dna.Select(ch => conv[ch]));
    }
}