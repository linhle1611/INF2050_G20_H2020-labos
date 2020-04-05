/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jberger.pergen.generated.lexer;

import org.jberger.pergen.generated.node.TZero;
import org.jberger.pergen.generated.node.TInteger;
import org.jberger.pergen.generated.node.TNumber;
import org.jberger.pergen.generated.node.TTo;
import org.jberger.pergen.generated.node.TReal;
import org.jberger.pergen.generated.node.TRPar;
import org.jberger.pergen.generated.node.TString;
import org.jberger.pergen.generated.node.TLPar;
import org.jberger.pergen.generated.node.TComma;
import org.jberger.pergen.generated.node.TMany;
import org.jberger.pergen.generated.node.TOne;
import org.jberger.pergen.generated.node.TEntity;
import org.jberger.pergen.generated.node.TSemicolon;
import org.jberger.pergen.generated.node.TUnique;
import org.jberger.pergen.generated.node.THas;
import org.jberger.pergen.generated.node.TRequired;
import org.jberger.pergen.generated.node.EOF;
import org.jberger.pergen.generated.node.TIdentifier;
import org.jberger.pergen.generated.node.TBlank;
import org.jberger.pergen.generated.node.Token;
import org.jberger.pergen.generated.node.TComment;
import org.jberger.pergen.generated.node.TDate;
import java.io.*;

@SuppressWarnings("nls")
public class Lexer
{
    protected Token token;
    protected State state = State.INITIAL;

    private PushbackReader in;
    private int line;
    private int pos;
    private boolean cr;
    private boolean eof;
    private final StringBuffer text = new StringBuffer();

    @SuppressWarnings("unused")
    protected void filter() throws LexerException, IOException
    {
        // Do nothing
    }

    public Lexer(@SuppressWarnings("hiding") PushbackReader in)
    {
        this.in = in;
    }
 
    public Token peek() throws LexerException, IOException
    {
        while(this.token == null)
        {
            this.token = getToken();
            filter();
        }

        return this.token;
    }

    public Token next() throws LexerException, IOException
    {
        while(this.token == null)
        {
            this.token = getToken();
            filter();
        }

        Token result = this.token;
        this.token = null;
        return result;
    }

    protected Token getToken() throws IOException, LexerException
    {
        int dfa_state = 0;

        int start_pos = this.pos;
        int start_line = this.line;

        int accept_state = -1;
        int accept_token = -1;
        int accept_length = -1;
        int accept_pos = -1;
        int accept_line = -1;

        @SuppressWarnings("hiding") int[][][] gotoTable = Lexer.gotoTable[this.state.id()];
        @SuppressWarnings("hiding") int[] accept = Lexer.accept[this.state.id()];
        this.text.setLength(0);

        while(true)
        {
            int c = getChar();

            if(c != -1)
            {
                switch(c)
                {
                case 10:
                    if(this.cr)
                    {
                        this.cr = false;
                    }
                    else
                    {
                        this.line++;
                        this.pos = 0;
                    }
                    break;
                case 13:
                    this.line++;
                    this.pos = 0;
                    this.cr = true;
                    break;
                default:
                    this.pos++;
                    this.cr = false;
                    break;
                }

                this.text.append((char) c);

                do
                {
                    int oldState = (dfa_state < -1) ? (-2 -dfa_state) : dfa_state;

                    dfa_state = -1;

                    int[][] tmp1 =  gotoTable[oldState];
                    int low = 0;
                    int high = tmp1.length - 1;

                    while(low <= high)
                    {
                        int middle = (low + high) / 2;
                        int[] tmp2 = tmp1[middle];

                        if(c < tmp2[0])
                        {
                            high = middle - 1;
                        }
                        else if(c > tmp2[1])
                        {
                            low = middle + 1;
                        }
                        else
                        {
                            dfa_state = tmp2[2];
                            break;
                        }
                    }
                }while(dfa_state < -1);
            }
            else
            {
                dfa_state = -1;
            }

            if(dfa_state >= 0)
            {
                if(accept[dfa_state] != -1)
                {
                    accept_state = dfa_state;
                    accept_token = accept[dfa_state];
                    accept_length = this.text.length();
                    accept_pos = this.pos;
                    accept_line = this.line;
                }
            }
            else
            {
                if(accept_state != -1)
                {
                    switch(accept_token)
                    {
                    case 0:
                        {
                            @SuppressWarnings("hiding") Token token = new0(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 1:
                        {
                            @SuppressWarnings("hiding") Token token = new1(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 2:
                        {
                            @SuppressWarnings("hiding") Token token = new2(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 3:
                        {
                            @SuppressWarnings("hiding") Token token = new3(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 4:
                        {
                            @SuppressWarnings("hiding") Token token = new4(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 5:
                        {
                            @SuppressWarnings("hiding") Token token = new5(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 6:
                        {
                            @SuppressWarnings("hiding") Token token = new6(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 7:
                        {
                            @SuppressWarnings("hiding") Token token = new7(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 8:
                        {
                            @SuppressWarnings("hiding") Token token = new8(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 9:
                        {
                            @SuppressWarnings("hiding") Token token = new9(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 10:
                        {
                            @SuppressWarnings("hiding") Token token = new10(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 11:
                        {
                            @SuppressWarnings("hiding") Token token = new11(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 12:
                        {
                            @SuppressWarnings("hiding") Token token = new12(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 13:
                        {
                            @SuppressWarnings("hiding") Token token = new13(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 14:
                        {
                            @SuppressWarnings("hiding") Token token = new14(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 15:
                        {
                            @SuppressWarnings("hiding") Token token = new15(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 16:
                        {
                            @SuppressWarnings("hiding") Token token = new16(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 17:
                        {
                            @SuppressWarnings("hiding") Token token = new17(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 18:
                        {
                            @SuppressWarnings("hiding") Token token = new18(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 19:
                        {
                            @SuppressWarnings("hiding") Token token = new19(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    }
                }
                else
                {
                    if(this.text.length() > 0)
                    {
                        throw new LexerException(
                            "[" + (start_line + 1) + "," + (start_pos + 1) + "]" +
                            " Unknown token: " + this.text);
                    }

                    @SuppressWarnings("hiding") EOF token = new EOF(
                        start_line + 1,
                        start_pos + 1);
                    return token;
                }
            }
        }
    }

    Token new0(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TLPar(line, pos); }
    Token new1(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TRPar(line, pos); }
    Token new2(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TComma(line, pos); }
    Token new3(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TSemicolon(line, pos); }
    Token new4(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TEntity(text, line, pos); }
    Token new5(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new THas(text, line, pos); }
    Token new6(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TMany(text, line, pos); }
    Token new7(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TOne(text, line, pos); }
    Token new8(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TRequired(text, line, pos); }
    Token new9(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTo(text, line, pos); }
    Token new10(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TUnique(text, line, pos); }
    Token new11(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TZero(text, line, pos); }
    Token new12(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TDate(text, line, pos); }
    Token new13(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TInteger(text, line, pos); }
    Token new14(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TReal(text, line, pos); }
    Token new15(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TString(text, line, pos); }
    Token new16(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TNumber(text, line, pos); }
    Token new17(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TIdentifier(text, line, pos); }
    Token new18(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TBlank(text, line, pos); }
    Token new19(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TComment(text, line, pos); }

    private int getChar() throws IOException
    {
        if(this.eof)
        {
            return -1;
        }

        int result = this.in.read();

        if(result == -1)
        {
            this.eof = true;
        }

        return result;
    }

    private void pushBack(int acceptLength) throws IOException
    {
        int length = this.text.length();
        for(int i = length - 1; i >= acceptLength; i--)
        {
            this.eof = false;

            this.in.unread(this.text.charAt(i));
        }
    }

    protected void unread(@SuppressWarnings("hiding") Token token) throws IOException
    {
        @SuppressWarnings("hiding") String text = token.getText();
        int length = text.length();

        for(int i = length - 1; i >= 0; i--)
        {
            this.eof = false;

            this.in.unread(text.charAt(i));
        }

        this.pos = token.getPos() - 1;
        this.line = token.getLine() - 1;
    }

    private String getText(int acceptLength)
    {
        StringBuffer s = new StringBuffer(acceptLength);
        for(int i = 0; i < acceptLength; i++)
        {
            s.append(this.text.charAt(i));
        }

        return s.toString();
    }

    private static int[][][][] gotoTable;
/*  {
        { // INITIAL
            {{9, 9, 1}, {10, 10, 2}, {13, 13, 3}, {32, 32, 4}, {40, 40, 5}, {41, 41, 6}, {44, 44, 7}, {47, 47, 8}, {48, 57, 9}, {59, 59, 10}, {65, 67, 11}, {68, 68, 12}, {69, 69, 13}, {70, 71, 11}, {72, 72, 14}, {73, 73, 15}, {74, 76, 11}, {77, 77, 16}, {78, 78, 11}, {79, 79, 17}, {80, 81, 11}, {82, 82, 18}, {83, 83, 19}, {84, 84, 20}, {85, 85, 21}, {86, 89, 11}, {90, 90, 22}, {97, 99, 23}, {100, 100, 24}, {101, 101, 25}, {102, 103, 23}, {104, 104, 26}, {105, 105, 27}, {106, 108, 23}, {109, 109, 28}, {110, 110, 23}, {111, 111, 29}, {112, 113, 23}, {114, 114, 30}, {115, 115, 31}, {116, 116, 32}, {117, 117, 33}, {118, 121, 23}, {122, 122, 34}, },
            {{9, 32, -2}, },
            {{9, 32, -2}, },
            {{9, 9, 1}, {10, 10, 35}, {13, 32, -2}, },
            {{9, 32, -2}, },
            {},
            {},
            {},
            {{42, 42, 36}, },
            {{48, 57, 9}, },
            {},
            {{48, 57, 37}, {65, 90, 38}, {95, 95, 39}, {97, 122, 40}, },
            {{48, 57, 37}, {65, 65, 41}, {66, 90, 38}, {95, 95, 39}, {97, 97, 42}, {98, 122, 40}, },
            {{48, 57, 37}, {65, 77, 38}, {78, 78, 43}, {79, 90, 38}, {95, 95, 39}, {97, 109, 40}, {110, 110, 44}, {111, 122, 40}, },
            {{48, 57, 37}, {65, 65, 45}, {66, 95, -14}, {97, 97, 46}, {98, 122, 40}, },
            {{48, 77, -15}, {78, 78, 47}, {79, 109, -15}, {110, 110, 48}, {111, 122, 40}, },
            {{48, 57, 37}, {65, 65, 49}, {66, 95, -14}, {97, 97, 50}, {98, 122, 40}, },
            {{48, 77, -15}, {78, 78, 51}, {79, 109, -15}, {110, 110, 52}, {111, 122, 40}, },
            {{48, 57, 37}, {65, 68, 38}, {69, 69, 53}, {70, 90, 38}, {95, 95, 39}, {97, 100, 40}, {101, 101, 54}, {102, 122, 40}, },
            {{48, 57, 37}, {65, 83, 38}, {84, 84, 55}, {85, 90, 38}, {95, 95, 39}, {97, 115, 40}, {116, 116, 56}, {117, 122, 40}, },
            {{48, 57, 37}, {65, 78, 38}, {79, 79, 57}, {80, 90, 38}, {95, 95, 39}, {97, 110, 40}, {111, 111, 58}, {112, 122, 40}, },
            {{48, 77, -15}, {78, 78, 59}, {79, 109, -15}, {110, 110, 60}, {111, 122, 40}, },
            {{48, 68, -20}, {69, 69, 61}, {70, 100, -20}, {101, 101, 62}, {102, 122, 40}, },
            {{48, 122, -13}, },
            {{48, 122, -14}, },
            {{48, 122, -15}, },
            {{48, 122, -16}, },
            {{48, 122, -17}, },
            {{48, 122, -18}, },
            {{48, 122, -19}, },
            {{48, 122, -20}, },
            {{48, 122, -21}, },
            {{48, 122, -22}, },
            {{48, 122, -23}, },
            {{48, 122, -24}, },
            {{9, 32, -2}, },
            {{0, 41, 63}, {42, 42, 64}, {43, 46, 63}, {47, 47, 65}, {48, 65535, 63}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
            {{48, 83, -21}, {84, 84, 66}, {85, 115, -21}, {116, 116, 67}, {117, 122, 40}, },
            {{48, 122, -43}, },
            {{48, 83, -21}, {84, 84, 68}, {85, 115, -21}, {116, 116, 69}, {117, 122, 40}, },
            {{48, 122, -45}, },
            {{48, 57, 37}, {65, 82, 38}, {83, 83, 70}, {84, 90, 38}, {95, 95, 39}, {97, 114, 40}, {115, 115, 71}, {116, 122, 40}, },
            {{48, 122, -47}, },
            {{48, 83, -21}, {84, 84, 72}, {85, 115, -21}, {116, 116, 73}, {117, 122, 40}, },
            {{48, 122, -49}, },
            {{48, 77, -15}, {78, 78, 74}, {79, 109, -15}, {110, 110, 75}, {111, 122, 40}, },
            {{48, 122, -51}, },
            {{48, 68, -20}, {69, 69, 76}, {70, 100, -20}, {101, 101, 77}, {102, 122, 40}, },
            {{48, 122, -53}, },
            {{48, 57, 37}, {65, 65, 78}, {66, 80, 38}, {81, 81, 79}, {82, 90, 38}, {95, 95, 39}, {97, 97, 80}, {98, 112, 40}, {113, 113, 81}, {114, 122, 40}, },
            {{48, 122, -55}, },
            {{48, 57, 37}, {65, 81, 38}, {82, 82, 82}, {83, 90, 38}, {95, 95, 39}, {97, 113, 40}, {114, 114, 83}, {115, 122, 40}, },
            {{48, 122, -57}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
            {{48, 57, 37}, {65, 72, 38}, {73, 73, 84}, {74, 90, 38}, {95, 95, 39}, {97, 104, 40}, {105, 105, 85}, {106, 122, 40}, },
            {{48, 122, -61}, },
            {{48, 81, -57}, {82, 82, 86}, {83, 113, -57}, {114, 114, 87}, {115, 122, 40}, },
            {{48, 122, -63}, },
            {{0, 41, 63}, {42, 42, 88}, {43, 46, 63}, {48, 65535, 63}, },
            {{42, 42, 88}, },
            {{42, 42, 88}, },
            {{48, 68, -20}, {69, 69, 89}, {70, 100, -20}, {101, 101, 90}, {102, 122, 40}, },
            {{48, 122, -68}, },
            {{48, 72, -61}, {73, 73, 91}, {74, 104, -61}, {105, 105, 92}, {106, 122, 40}, },
            {{48, 122, -70}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
            {{48, 68, -20}, {69, 69, 93}, {70, 100, -20}, {101, 101, 94}, {102, 122, 40}, },
            {{48, 122, -74}, },
            {{48, 57, 37}, {65, 88, 38}, {89, 89, 95}, {90, 90, 38}, {95, 95, 39}, {97, 120, 40}, {121, 121, 96}, {122, 122, 40}, },
            {{48, 122, -76}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
            {{48, 57, 37}, {65, 75, 38}, {76, 76, 97}, {77, 90, 38}, {95, 95, 39}, {97, 107, 40}, {108, 108, 98}, {109, 122, 40}, },
            {{48, 57, 37}, {65, 84, 38}, {85, 85, 99}, {86, 90, 38}, {95, 95, 39}, {97, 116, 40}, {117, 117, 100}, {118, 122, 40}, },
            {{48, 122, -80}, },
            {{48, 122, -81}, },
            {{48, 72, -61}, {73, 73, 101}, {74, 104, -61}, {105, 105, 102}, {106, 122, 40}, },
            {{48, 122, -84}, },
            {{48, 57, 37}, {65, 80, 38}, {81, 81, 103}, {82, 95, -55}, {97, 112, 40}, {113, 113, 104}, {114, 122, 40}, },
            {{48, 122, -86}, },
            {{48, 78, -22}, {79, 79, 105}, {80, 110, -22}, {111, 111, 106}, {112, 122, 40}, },
            {{48, 122, -88}, },
            {{47, 47, 107}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
            {{48, 83, -21}, {84, 84, 108}, {85, 115, -21}, {116, 116, 109}, {117, 122, 40}, },
            {{48, 122, -93}, },
            {{48, 57, 37}, {65, 70, 38}, {71, 71, 110}, {72, 90, 38}, {95, 95, 39}, {97, 102, 40}, {103, 103, 111}, {104, 122, 40}, },
            {{48, 122, -95}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
            {{48, 72, -61}, {73, 73, 112}, {74, 104, -61}, {105, 105, 113}, {106, 122, 40}, },
            {{48, 122, -101}, },
            {{48, 77, -15}, {78, 78, 114}, {79, 109, -15}, {110, 110, 115}, {111, 122, 40}, },
            {{48, 122, -103}, },
            {{48, 84, -81}, {85, 85, 116}, {86, 116, -81}, {117, 117, 117}, {118, 122, 40}, },
            {{48, 122, -105}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
            {},
            {{48, 88, -76}, {89, 89, 118}, {90, 120, -76}, {121, 121, 119}, {122, 122, 40}, },
            {{48, 122, -110}, },
            {{48, 68, -20}, {69, 69, 120}, {70, 100, -20}, {101, 101, 121}, {102, 122, 40}, },
            {{48, 122, -112}, },
            {{48, 81, -57}, {82, 82, 122}, {83, 113, -57}, {114, 114, 123}, {115, 122, 40}, },
            {{48, 122, -114}, },
            {{48, 70, -95}, {71, 71, 124}, {72, 102, -95}, {103, 103, 125}, {104, 122, 40}, },
            {{48, 122, -116}, },
            {{48, 68, -20}, {69, 69, 126}, {70, 100, -20}, {101, 101, 127}, {102, 122, 40}, },
            {{48, 122, -118}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
            {{48, 81, -57}, {82, 82, 128}, {83, 113, -57}, {114, 114, 129}, {115, 122, 40}, },
            {{48, 122, -122}, },
            {{48, 68, -20}, {69, 69, 130}, {70, 100, -20}, {101, 101, 131}, {102, 122, 40}, },
            {{48, 122, -124}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
            {{48, 57, 37}, {65, 67, 38}, {68, 68, 132}, {69, 90, 38}, {95, 95, 39}, {97, 99, 40}, {100, 100, 133}, {101, 122, 40}, },
            {{48, 122, -132}, },
            {{48, 122, -13}, },
            {{48, 122, -13}, },
        }
    };*/

    private static int[][] accept;
/*  {
        // INITIAL
        {-1, 18, 18, 18, 18, 0, 1, 2, -1, 16, 3, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 18, -1, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 9, 9, 17, 17, 17, 17, -1, -1, -1, 17, 17, 17, 17, 5, 5, 17, 17, 17, 17, 7, 7, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, -1, 12, 12, 17, 17, 17, 17, 6, 6, 14, 14, 17, 17, 17, 17, 17, 17, 11, 11, 19, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 4, 4, 17, 17, 17, 17, 15, 15, 10, 10, 13, 13, 17, 17, 8, 8, },

    };*/

    public static class State
    {
        public final static State INITIAL = new State(0);

        private int id;

        private State(@SuppressWarnings("hiding") int id)
        {
            this.id = id;
        }

        public int id()
        {
            return this.id;
        }
    }

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Lexer.class.getResourceAsStream("lexer.dat")));

            // read gotoTable
            int length = s.readInt();
            gotoTable = new int[length][][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][][];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                    length = s.readInt();
                    gotoTable[i][j] = new int[length][3];
                    for(int k = 0; k < gotoTable[i][j].length; k++)
                    {
                        for(int l = 0; l < 3; l++)
                        {
                            gotoTable[i][j][k][l] = s.readInt();
                        }
                    }
                }
            }

            // read accept
            length = s.readInt();
            accept = new int[length][];
            for(int i = 0; i < accept.length; i++)
            {
                length = s.readInt();
                accept[i] = new int[length];
                for(int j = 0; j < accept[i].length; j++)
                {
                    accept[i][j] = s.readInt();
                }
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"lexer.dat\" is either missing or corrupted.");
        }
    }
}
