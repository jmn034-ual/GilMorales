import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';

@customElement('vista-top-usuarios-item')
export class VistaTopUsuariosItem extends LitElement {
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
<vaadin-horizontal-layout class="content" style="justify-content: flex-start; margin: 0px; padding: 0px;" id="vaadinHorizontalLayout" theme="spacing-xs" dir="layoutItem">
 <vaadin-vertical-layout theme="spacing" id="fotoPerfil" style="align-self: center;">
  <vaadin-avatar id="fotoPerfil1"></vaadin-avatar>
 </vaadin-vertical-layout>
 <vaadin-button theme="tertiary" id="nombreUsuario" style="align-self: center;">
   Tertiary 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
