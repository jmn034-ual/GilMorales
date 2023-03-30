import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-publicaciones-propias-item')
export class VistaPublicacionesPropiasItem extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

   render() {
    return html`
<vaadin-horizontal-layout class="content" style="justify-content: center; width: 100%;" id="layoutItem" theme="spacing">
 <vaadin-vertical-layout theme="spacing" id="layoutVideo" style="align-self: center;"></vaadin-vertical-layout>
 <vaadin-button theme="tertiary" id="botonNombreUsuario" style="align-self: center;">
   Tertiary 
 </vaadin-button>
 <vaadin-button id="botonSeguir" style="align-self: center;">
   Seguir 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
