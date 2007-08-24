/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.util.*;
import java.sql.*;
import java.math.*;
import java.lang.reflect.Constructor;
import java.util.logging.Level;
import org.compiere.util.*;

/** Generated Model for C_BPartner_Product
 *  @author Adempiere (generated) 
 *  @version Release 3.3.0 - $Id$ */
public class X_C_BPartner_Product extends PO implements I_C_BPartner_Product, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_C_BPartner_Product (Properties ctx, int C_BPartner_Product_ID, String trxName)
    {
      super (ctx, C_BPartner_Product_ID, trxName);
      /** if (C_BPartner_Product_ID == 0)        {			setC_BPartner_ID (0);
			setM_Product_ID (0);
			setShelfLifeMinDays (0);
			setShelfLifeMinPct (0);
} */
    }

    /** Load Constructor */
    public X_C_BPartner_Product (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_C_BPartner_Product[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1)
			 throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		if (Description != null && Description.length() > 255)
		{
			log.warning("Length > 255 - truncated");
			Description = Description.substring(0, 254);
		}
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Product.
		@param M_Product_ID 
		Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1)
			 throw new IllegalArgumentException ("M_Product_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Manufacturer.
		@param Manufacturer 
		Manufacturer of the Product
	  */
	public void setManufacturer (String Manufacturer)
	{
		if (Manufacturer != null && Manufacturer.length() > 30)
		{
			log.warning("Length > 30 - truncated");
			Manufacturer = Manufacturer.substring(0, 29);
		}
		set_Value (COLUMNNAME_Manufacturer, Manufacturer);
	}

	/** Get Manufacturer.
		@return Manufacturer of the Product
	  */
	public String getManufacturer () 
	{
		return (String)get_Value(COLUMNNAME_Manufacturer);
	}

	/** Set Quality Rating.
		@param QualityRating 
		Method for rating vendors
	  */
	public void setQualityRating (BigDecimal QualityRating)
	{
		set_Value (COLUMNNAME_QualityRating, QualityRating);
	}

	/** Get Quality Rating.
		@return Method for rating vendors
	  */
	public BigDecimal getQualityRating () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QualityRating);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Min Shelf Life Days.
		@param ShelfLifeMinDays 
		Minimum Shelf Life in days based on Product Instance Guarantee Date
	  */
	public void setShelfLifeMinDays (int ShelfLifeMinDays)
	{
		set_Value (COLUMNNAME_ShelfLifeMinDays, Integer.valueOf(ShelfLifeMinDays));
	}

	/** Get Min Shelf Life Days.
		@return Minimum Shelf Life in days based on Product Instance Guarantee Date
	  */
	public int getShelfLifeMinDays () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ShelfLifeMinDays);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Min Shelf Life %.
		@param ShelfLifeMinPct 
		Minimum Shelf Life in percent based on Product Instance Guarantee Date
	  */
	public void setShelfLifeMinPct (int ShelfLifeMinPct)
	{
		set_Value (COLUMNNAME_ShelfLifeMinPct, Integer.valueOf(ShelfLifeMinPct));
	}

	/** Get Min Shelf Life %.
		@return Minimum Shelf Life in percent based on Product Instance Guarantee Date
	  */
	public int getShelfLifeMinPct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ShelfLifeMinPct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Partner Category.
		@param VendorCategory 
		Product Category of the Business Partner
	  */
	public void setVendorCategory (String VendorCategory)
	{
		if (VendorCategory != null && VendorCategory.length() > 30)
		{
			log.warning("Length > 30 - truncated");
			VendorCategory = VendorCategory.substring(0, 29);
		}
		set_Value (COLUMNNAME_VendorCategory, VendorCategory);
	}

	/** Get Partner Category.
		@return Product Category of the Business Partner
	  */
	public String getVendorCategory () 
	{
		return (String)get_Value(COLUMNNAME_VendorCategory);
	}

	/** Set Partner Product Key.
		@param VendorProductNo 
		Product Key of the Business Partner
	  */
	public void setVendorProductNo (String VendorProductNo)
	{
		if (VendorProductNo != null && VendorProductNo.length() > 30)
		{
			log.warning("Length > 30 - truncated");
			VendorProductNo = VendorProductNo.substring(0, 29);
		}
		set_Value (COLUMNNAME_VendorProductNo, VendorProductNo);
	}

	/** Get Partner Product Key.
		@return Product Key of the Business Partner
	  */
	public String getVendorProductNo () 
	{
		return (String)get_Value(COLUMNNAME_VendorProductNo);
	}
}