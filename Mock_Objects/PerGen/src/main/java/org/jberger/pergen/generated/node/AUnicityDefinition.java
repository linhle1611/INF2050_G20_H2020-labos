/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jberger.pergen.generated.node;

import org.jberger.pergen.generated.analysis.Analysis;
import java.util.*;

@SuppressWarnings("nls")
public final class AUnicityDefinition extends PUnicityDefinition
{
    private TUnique _unique_;
    private TLPar _lPar_;
    private TIdentifier _identifier_;
    private final LinkedList<PMoreIdentifier> _moreIdentifier_ = new LinkedList<PMoreIdentifier>();
    private TRPar _rPar_;

    public AUnicityDefinition()
    {
        // Constructor
    }

    public AUnicityDefinition(
        @SuppressWarnings("hiding") TUnique _unique_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") List<PMoreIdentifier> _moreIdentifier_,
        @SuppressWarnings("hiding") TRPar _rPar_)
    {
        // Constructor
        setUnique(_unique_);

        setLPar(_lPar_);

        setIdentifier(_identifier_);

        setMoreIdentifier(_moreIdentifier_);

        setRPar(_rPar_);

    }

    @Override
    public Object clone()
    {
        return new AUnicityDefinition(
            cloneNode(this._unique_),
            cloneNode(this._lPar_),
            cloneNode(this._identifier_),
            cloneList(this._moreIdentifier_),
            cloneNode(this._rPar_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnicityDefinition(this);
    }

    public TUnique getUnique()
    {
        return this._unique_;
    }

    public void setUnique(TUnique node)
    {
        if(this._unique_ != null)
        {
            this._unique_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unique_ = node;
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public LinkedList<PMoreIdentifier> getMoreIdentifier()
    {
        return this._moreIdentifier_;
    }

    public void setMoreIdentifier(List<PMoreIdentifier> list)
    {
        this._moreIdentifier_.clear();
        this._moreIdentifier_.addAll(list);
        for(PMoreIdentifier e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._unique_)
            + toString(this._lPar_)
            + toString(this._identifier_)
            + toString(this._moreIdentifier_)
            + toString(this._rPar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._unique_ == child)
        {
            this._unique_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._moreIdentifier_.remove(child))
        {
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._unique_ == oldChild)
        {
            setUnique((TUnique) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        for(ListIterator<PMoreIdentifier> i = this._moreIdentifier_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PMoreIdentifier) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
